package com.example.lnct_connect.Login;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lnct_connect.Student.*;
import com.example.lnct_connect.Admin.*;
import com.example.lnct_connect.Common.*;
import com.example.lnct_connect.Faculty.*;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.lnct_connect.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        new Handler(  ).postDelayed( new Runnable() {
            @Override
            public void run() {
                if (MainActivity.this==null){
                    return;
                }
                Intent splash = new Intent( getApplicationContext(), Choice.class );
                startActivity( splash );
                finish();

            }
        },3500 );
    }
}