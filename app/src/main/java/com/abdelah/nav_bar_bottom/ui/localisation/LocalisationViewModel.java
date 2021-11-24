package com.abdelah.nav_bar_bottom.ui.localisation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalisationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LocalisationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Localisation fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}