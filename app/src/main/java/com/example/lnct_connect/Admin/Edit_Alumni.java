package com.example.lnct_connect.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.lnct_connect.R;

public class Edit_Alumni extends AppCompatActivity {
    EditText Id, NameAlumni, Placed, EmailAlumni;
    Button EditAlumni;
    ImageView cross2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_edit__alumni );

        Id = findViewById( R.id.AlumniId );
        NameAlumni = findViewById( R.id.NameAlumni);
        Placed = findViewById( R.id.Placed );
        EmailAlumni = findViewById( R.id.EmailofAlumni );
        cross2 = findViewById( R.id.cancel2 );
        EditAlumni = findViewById( R.id.editSubmit );

        //on clicking cross

        cross2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cross2 = new Intent( getApplicationContext(),Add_Alumni.class );
                startActivity( cross2 );
            }
        } );

        //on submit button click

        EditAlumni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty( Id.getText().toString().trim() )){
                    Id.setError( "Id cannot be empty" );
                }

               else if (TextUtils.isEmpty( NameAlumni.getText().toString().trim() )){
                    NameAlumni.setError( "Name cannot be empty" );
                }

               else if (TextUtils.isEmpty( Placed.getText().toString().trim() )){
                    Placed.setError( "company name cannot be empty" );
                }
               else if (TextUtils.isEmpty( EmailAlumni.getText().toString().trim() )){
                    EmailAlumni.setError( "Email cannot be empty" );
                }

               else {

                   //submit coding
                }




            }
        } );





    }
}