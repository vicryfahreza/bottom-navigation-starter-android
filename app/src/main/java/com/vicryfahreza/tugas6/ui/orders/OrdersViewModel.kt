package com.vicryfahreza.tugas6.ui.orders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrdersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "List Pembelian"
    }
    val text: LiveData<String> = _text
}