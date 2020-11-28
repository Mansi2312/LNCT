package com.example.lnct_connect.Student.ui.Logout;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;

public class LogoutVieModel extends ViewModel {

            private MutableLiveData<String> mText;

            public  LogoutVieModel() {
                mText = new MutableLiveData<>();
                mText.setValue( "This is logout fragment" );
            }

            public LiveData<String> getText() {
                return mText;
            }
        }

