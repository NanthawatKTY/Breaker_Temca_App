package com.example.breakertemcaapp.ui.conduit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConduitViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is conduit Fragment"
    }
    val text: LiveData<String> = _text
}