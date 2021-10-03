package com.example.daggerhiltapp.vm

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("name1") str1: String
) : ViewModel() {

    init {
        Log.d("mainVM", "View model string - $str1")
    }
}