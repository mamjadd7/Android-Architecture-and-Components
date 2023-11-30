package com.example.androidarchitecture

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModalFactor(val counter: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return MainViewModalFactor(counter) as T

    }

}