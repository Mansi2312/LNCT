package com.example.lnct_connect.Student.ui.Contact;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.lnct_connect.Faculty.*;
import com.example.lnct_connect.Login.*;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContactViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue( "This is contact fragment" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}