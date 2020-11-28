package com.example.lnct_connect.Admin;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lnct_connect.Common.*;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;
import com.example.lnct_connect.R;
import com.example.lnct_connect.Student.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Add_Alumni extends AppCompatActivity {

    RadioButton addAlumni,editAlumni,deleteAlumni;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add__alumni );
        addAlumni = findViewById( R.id.radioaddalumni );
        editAlumni = findViewById( R.id.radioeditalumni );
        deleteAlumni = findViewById(  R.id.radiodeletealumni );
        back = findViewById( R.id.back );


        //open add variant activity
        addAlumni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent( getApplicationContext(),Add_Variant.class );
                startActivity( add );
            }
        } );

        //open edit alumni activity

        editAlumni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit = new Intent( getApplicationContext(),Delete_Alumni.class );
                startActivity( edit );
            }
        } );

        //open delete alumni activity

        deleteAlumni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delete = new Intent( getApplicationContext(),Delete_Alumni.class );
                startActivity( delete );
            }
        } );

        //going back

        back.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );



    }
}