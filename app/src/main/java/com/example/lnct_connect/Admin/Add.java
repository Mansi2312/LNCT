package com.example.lnct_connect.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.lnct_connect.R;

public class Add extends AppCompatActivity {

    ImageButton addAlumni,addCalendar, addNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add );


        addAlumni = findViewById( R.id.addAlumni );
        addCalendar = findViewById( R.id.addCalendar );
        addNotice = findViewById( R.id.addNotice );

        //open add alumni activity

        addAlumni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addAlumni = new Intent(getApplicationContext(),Add_Alumni.class);
                startActivity(addAlumni );
            }
        } );

        //open calendar activity

        addCalendar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addCalendar = new Intent(getApplicationContext(),Add_Calendar.class);
                startActivity(addCalendar);

            }
        } );

        //open notice activity

        addNotice.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addNotice = new Intent(getApplicationContext(),Add_Notice.class);
                startActivity( addNotice );
            }
        } );


    }
}