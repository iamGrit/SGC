package com.gritlab.test2.ui.landinghome;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LandingHomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LandingHomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}