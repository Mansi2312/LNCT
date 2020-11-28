package com.example.lnct_connect.Faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.lnct_connect.Common.Calendar;
import com.example.lnct_connect.Common.Notice;
import com.example.lnct_connect.Common.Profile;
import com.example.lnct_connect.R;

public class Home extends AppCompatActivity {

    ImageButton alumni1,calendar1,addDocument, notice1, profile1, resume1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home2 );


        alumni1= findViewById( R.id.alumni1 );
        calendar1= findViewById( R.id.calendar1 );
       addDocument= findViewById( R.id.adddocument );
        notice1= findViewById( R.id.notice1);
      profile1= findViewById( R.id.profile1 );
       resume1= findViewById( R.id.resume1);


       //starting Alumni activity
       alumni1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent alumni1 = new Intent( getApplicationContext(),Alumni.class );
               startActivity( alumni1 );
           }
       } );
        //starting add_Docs activity

        addDocument.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent addDocument = new Intent( getApplicationContext(),Add_Document.class );
               startActivity( addDocument );
           }


       } );
        //starting Resume activity

       resume1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent resume1 = new Intent( getApplicationContext(), Resume_Faculty.class );
               startActivity( resume1 );
           }
       } );

        //starting Calendar activity

       calendar1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent calendar1 = new Intent( getApplicationContext(), Calendar.class );
               startActivity( calendar1 );
           }
       } );

        //starting Notice activity

       notice1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent notice1 = new Intent( getApplicationContext(), Notice.class );
               startActivity( notice1 );
           }
       } );

        //starting Profile activity

       profile1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent profile1 = new Intent( getApplicationContext(), Profile.class );
               startActivity( profile1 );
           }
       } );




    }
}