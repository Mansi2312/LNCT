package com.example.lnct_connect.Faculty;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lnct_connect.AddResumeClass;
import com.example.lnct_connect.AddVariantClass;
import com.example.lnct_connect.Student.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;
import com.example.lnct_connect.Login.*;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lnct_connect.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Resume_Faculty extends AppCompatActivity {
    EditText facultyName, facultyEmail, facultyQualification , facultySkill;
    Button submitResume;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_resume2 );


        facultyName = findViewById( R.id.facultyname );
        facultyEmail = findViewById( R.id.facultyemail );
        facultyQualification = findViewById( R.id.facultyqualification );
        facultySkill = findViewById( R.id.facultyskills );
        submitResume = findViewById( R.id.submitresume );

        //on button click

        submitResume.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty( facultyName.getText().toString().trim() )){
                    facultyName.setError( "NAME CANNOT BE EMPTY" );

                }
                else if (TextUtils.isEmpty( facultyEmail.getText().toString().trim() )){
                    facultyEmail.setError( "EMAIL CANNOT BE EMPTY" );

                }
                else if (TextUtils.isEmpty( facultyQualification.getText().toString().trim() )){
                    facultyQualification.setError( "QUALIFICATION CANNOT BE EMPTY" );

                }
               else if (TextUtils.isEmpty( facultySkill.getText().toString().trim() )){
                    facultySkill.setError( "SKILLS CANNOT BE EMPTY" );

                }

               else {

                    rootNode = FirebaseDatabase.getInstance();
                    reference=rootNode.getReference("Resume");

                    String name= facultyName.getText().toString();
                    String email= facultyEmail.getText().toString();
                    String qualification=facultyQualification.getText().toString();
                    String skill=facultySkill.getText().toString();

                    AddResumeClass resumehelperClass= new AddResumeClass(name,email,qualification,skill);
                    reference.child(name).setValue(resumehelperClass);

                }
            }
        } );





    }
}