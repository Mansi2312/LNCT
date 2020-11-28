package com.example.lnct_connect.Student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;

import com.example.lnct_connect.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Student_Login extends AppCompatActivity {
    Button login;
    EditText student_Id , student_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_student__login );
        login = findViewById( R.id.log);
        student_Id = findViewById( R.id.studentid );
        student_Password = findViewById( R.id.studentpassword );

        //On login button click
        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(student_Id.getText().toString().trim())){
                    student_Id.setError( "Unique id cannot be empty" );
                }
                else if(TextUtils.isEmpty( student_Password.getText().toString().trim() )){
                    student_Password.setError( "Password cannot be empty" );
                }
                else {
                    isUser();

                }


            }
        } );


    }

    private void isUser() {
        final String userEnteredId= student_Id.getText().toString().trim();
        final String userEnteredpassword= student_Password.getText().toString().trim();

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("student");
        Query checkUser =reference.orderByChild("id").equalTo(userEnteredId);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datanSapshot) {
                if(datanSapshot.exists()){
                    student_Id.setError(null);

                    String passwordFromDB=datanSapshot.child(userEnteredId).child("password").getValue(String.class);


                    if(passwordFromDB.equalsIgnoreCase(userEnteredpassword)){
                        student_Id.setError(null);
                        Intent next = new Intent( getApplicationContext(), HomeActivity.class   );
                        startActivity( next );

                    }
                    else{
                        student_Password.setError("WRONG PASSWORD");
                        student_Password.requestFocus();
                    }
                }
                else
                {
                    student_Id.setError("NO SUCH USER EXITS");
                    student_Id.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) { }
        });

    }
}