package com.example.lnct_connect.Student.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.lnct_connect.Common.Calendar;
import com.example.lnct_connect.Common.Notice;
import com.example.lnct_connect.Common.Profile;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;

import com.example.lnct_connect.R;
import com.example.lnct_connect.Student.Alumni;
import com.example.lnct_connect.Student.Document;
import com.example.lnct_connect.Student.Resume;

public class HomeFragment extends Fragment {
    ImageButton alumni ,calendar,document,notice,profile,resume;


    private HomeViewModel homeViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       /* ImageButton alumni = (ImageButton)inflater.inflate( R.layout.activity_alumni,null );
        ImageButton calendar = (ImageButton)inflater.inflate( R.layout.activity_calendar,null );
        ImageButton document = (ImageButton)inflater.inflate( R.layout.activity_document,null );
        ImageButton notice = (ImageButton)inflater.inflate( R.layout.activity_notice,null );
        ImageButton profile = (ImageButton)inflater.inflate( R.layout.activity_profile,null );
        ImageButton resume = (ImageButton)inflater.inflate( R.layout.activity_resume,null );

        alumni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumni = new Intent(getContext(), Alumni.class );
                startActivity( alumni );
            }
        } );

        calendar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumni = new Intent(getContext(), Calendar.class );
                startActivity( alumni );
            }
        } );

        document.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumni = new Intent(getContext(), Document.class );
                startActivity( alumni );
            }
        } );

        notice.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumni = new Intent(getContext(), Notice.class );
                startActivity( alumni );
            }
        } );

        profile.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumni = new Intent(getContext(), Profile.class );
                startActivity( alumni );
            }
        } );

        resume.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumni = new Intent(getContext(), Resume.class );
                startActivity( alumni );
            }
        } ); */








        homeViewModel =
                ViewModelProviders.of( this ).get( HomeViewModel.class );
        View root = inflater.inflate( R.layout.fragment_home, container, false );

        homeViewModel.getText().observe( getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        } );
        return root;

    }





}