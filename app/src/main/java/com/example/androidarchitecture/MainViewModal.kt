package com.example.androidarchitecture

import androidx.lifecycle.ViewModel

class MainViewModal : ViewModel() {
    var count: Int =0
    fun increment(){
            count++
    }
}