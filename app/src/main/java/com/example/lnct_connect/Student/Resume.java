package com.example.lnct_connect.Student;

import androidx.appcompat.app.AppCompatActivity;


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

public class Resume extends AppCompatActivity {
    EditText StudentName , StudentEmail, StudentClub , StudentSkills;
    Button StudentSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_resume );

        StudentClub = findViewById( R.id.StudentClub );
        StudentName = findViewById( R.id.StudentName );
        StudentEmail = findViewById( R.id.StudentEmail);
        StudentSkills = findViewById( R.id.StudentSkills);
        StudentSubmit = findViewById( R.id.StudentSubmit );

        //on button click

        StudentSubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty( StudentClub.getText().toString().trim() )){
                    StudentClub.setError( "Club name cannot be empty" );

                }
                else if (TextUtils.isEmpty( StudentName.getText().toString().trim() )){
                    StudentName.setError( "Name cannot be empty" );

                }
                else if (TextUtils.isEmpty( StudentEmail.getText().toString().trim() )){
                    StudentEmail.setError( "Email cannot be empty" );

                }
               else if (TextUtils.isEmpty( StudentSkills.getText().toString().trim() )){
                    StudentSkills.setError( "Name cannot be empty" );

                }

               else {

                   // on submit code
                }

            }
        } );






    }
}