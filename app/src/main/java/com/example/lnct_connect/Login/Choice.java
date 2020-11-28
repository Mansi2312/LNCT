package com.example.lnct_connect.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import com.example.lnct_connect.Student.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;
import com.example.lnct_connect.Faculty.*;

import com.example.lnct_connect.Faculty.Faculty_Login;
import com.example.lnct_connect.R;
import com.example.lnct_connect.Student.Student_Login;

public class Choice extends AppCompatActivity {
    RadioButton faculty , student , admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_choice );


        student = findViewById( R.id.student );
        faculty = findViewById( R.id.faculty );
        admin = findViewById( R.id.admin );


        student.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getApplicationContext(),"student login",Toast.LENGTH_SHORT ).show();
                Intent studentLogin = new Intent( getApplicationContext(), Student_Login.class );
                startActivity( studentLogin );
            }
        } );

        faculty.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getApplicationContext(),"Faculty login",Toast.LENGTH_SHORT ).show();
                Intent facultyLogin = new Intent( getApplicationContext(), Faculty_Login.class );
                startActivity( facultyLogin );
            }
        } );

        admin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getApplicationContext(),"Admin Login",Toast.LENGTH_SHORT).show();
                Intent adminLogin = new Intent( getApplicationContext(), Admin_Login.class);
                startActivity( adminLogin );
            }
        } );


    }
}