package com.example.lnct_connect.Student.ui.Logout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;


import com.example.lnct_connect.R;

public class LogoutFragment extends Fragment {
    private LogoutVieModel logoutVieModel;

    public View onCreateView(@NonNull LayoutInflater inflater ,
                             ViewGroup container , Bundle savedInstanceState) {
        logoutVieModel =
                ViewModelProviders.of( this ).get( LogoutVieModel.class );

        View root = inflater.inflate(R.layout.fragment_logout , container , false );
        logoutVieModel.getText().observe( getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {

            }
        } );
        return root;

    }

    }

