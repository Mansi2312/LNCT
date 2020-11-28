package com.example.lnct_connect.Faculty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lnct_connect.FacultyHelperClass;
import com.example.lnct_connect.Student.*;
import com.example.lnct_connect.Login.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lnct_connect.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Faculty_Login extends AppCompatActivity {
    Button login1;
    EditText faculty_Id, faculty_Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_faculty__login );

        login1 = findViewById( R.id.log1 );
        faculty_Id = findViewById( R.id.facultyid );
        faculty_Password = findViewById( R.id.facultypassword );




        //on button click
        login1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(TextUtils.isEmpty( faculty_Id.getText().toString().trim() )){
                    faculty_Id.setError( "Unique id cannot be empty" );
                }
                else if (TextUtils.isEmpty( faculty_Password.getText().toString().trim() )){
                    faculty_Password.setError( "Password cannot be empty" );

                }
                else{
                    isUser();

                }
            }
        } );
    }

    private void isUser() {
        final String userEnteredId= faculty_Id.getText().toString().trim();
        final String userEnteredpassword= faculty_Password.getText().toString().trim();

        DatabaseReference reference=FirebaseDatabase.getInstance().getReference("faculty");
        Query checkUser =reference.orderByChild("id").equalTo(userEnteredId);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datanSapshot) {
                if(datanSapshot.exists()){
                    faculty_Id.setError(null);

                    String passwordFromDB=datanSapshot.child(userEnteredId).child("password").getValue(String.class);


                    if(passwordFromDB.equalsIgnoreCase(userEnteredpassword)){
                        faculty_Id.setError(null);
                        Intent addd = new Intent(getApplicationContext(), Home.class);
                        startActivity(addd);
                    }
                    else{
                        faculty_Password.setError("WRONG PASSWORD");
                        faculty_Password.requestFocus();
                    }
                }
                else
                {
                    faculty_Id.setError("NO SUCH USER EXITS");
                    faculty_Id.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) { }
        });
    }
}