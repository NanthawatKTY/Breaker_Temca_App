package com.example.breakertemcaapp.ui.power_cable

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PowerCableViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is power cable Fragment"
    }
    val text: LiveData<String> = _text
}