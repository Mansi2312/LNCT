package com.example.lnct_connect.Student.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue( "This is home fragment" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}