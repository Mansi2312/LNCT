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

public class Delete_Alumni extends AppCompatActivity {
    EditText Delete_Id;
    ImageView cross1;
    Button Delete_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_delete__alumni );

       Delete_Id = findViewById( R.id.deleteId );
       cross1 = findViewById( R.id.cancel1 );
       Delete_Submit = findViewById( R.id.deleteSubmit );

       //on selecting cross

       cross1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent cross1 = new Intent( getApplicationContext(),Add_Alumni.class );
               startActivity( cross1 );

           }
       } );

       //on submit click

        Delete_Submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty( Delete_Id.getText().toString().trim() )){
                    Delete_Id.setError( "Id cannot be empty" );
                }

                else {

                    //code for submit

                }




            }
        } );



    }
}