package com.gritlab.test2.ui.sgcikorodu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SgcIkoroduViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SgcIkoroduViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}