package com.aungbophyoe.space.words

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _key : MutableLiveData<Int> = MutableLiveData(0)
    val key : LiveData<Int> = _key

    fun setKey(v:Int){
        viewModelScope.launch {
         _key.value = v
        }
    }

    fun add(_v:Int){
        viewModelScope.launch {
            val v = _v + 1
            _key.value = v
        }
    }

    fun minus(_v:Int){
        viewModelScope.launch {
            val v = _v - 1
            _key.value = v
        }
    }
}