package com.example.lnct_connect.Faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.lnct_connect.Student.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;
import com.example.lnct_connect.Login.*;

import com.example.lnct_connect.R;

public class Add_Document extends AppCompatActivity {
    EditText branch, subject, semester;
    ImageButton upload_doc;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add__document );

        branch = findViewById( R.id.branch );
        subject = findViewById( R.id.subject );
        semester = findViewById( R.id.semester );
        upload_doc = findViewById( R.id.upload_doc );
        submit = findViewById( R.id.submit );


        //on button click

        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty( branch.getText().toString().trim()))
                {
                    branch.setError( "Branch name cannot be empty" );
                }
                else if(TextUtils.isEmpty( subject.getText().toString().trim())){
                    subject.setError( "Subject name cannot be empty" );

                }
                else if(TextUtils.isEmpty( semester.getText().toString().trim() )){
                    semester.setError( "Semester cannot be empty" );
                }
                else if (upload_doc.getDrawable() == null ){
                    Toast.makeText( getApplicationContext(),"Document cannot be empty",Toast.LENGTH_SHORT ).show();;
                }

                else {

                    //SUBMIT TO DATABASE
                }

            }
        } );




    }
}