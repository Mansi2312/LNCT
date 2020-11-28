package com.example.lnct_connect.Admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lnct_connect.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Admin_Login extends AppCompatActivity {

    Button login3;
    EditText admin_Id, admin_Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin_login );


        admin_Id = findViewById( R.id.adminid );
        admin_Password = findViewById( R.id.adminPassword );
        login3 = findViewById( R.id.login3 );

        login3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty( admin_Id.getText().toString().trim() )){
                    admin_Id.setError( "Unique id cannot be empty" );
                }
                else if (TextUtils.isEmpty( admin_Password.getText().toString().trim() )){
                    admin_Password.setError( "Password cannot be empty" );

                }

            else {

                isUser();

                }
            }

            private void isUser() {
                final String userEnteredId= admin_Id.getText().toString().trim();
                final String userEnteredpassword= admin_Password.getText().toString().trim();

                DatabaseReference reference=FirebaseDatabase.getInstance().getReference("admin");
                Query checkUser =reference.orderByChild("id").equalTo(userEnteredId);
                checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot datanSapshot) {
                        if(datanSapshot.exists()){
                            admin_Id.setError(null);

                            String passwordFromDB=datanSapshot.child(userEnteredId).child("password").getValue(String.class);


                            if(passwordFromDB.equalsIgnoreCase(userEnteredpassword)){
                                admin_Id.setError(null);
                                Intent add = new Intent(getApplicationContext(), Add.class);
                                startActivity(add);

                            }
                            else{
                                admin_Password.setError("WRONG PASSWORD");
                                admin_Password.requestFocus();
                            }
                        }
                        else
                        {
                            admin_Id.setError("NO SUCH USER EXITS");
                            admin_Id.requestFocus();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) { }
                });

            }
        } );


    }
}