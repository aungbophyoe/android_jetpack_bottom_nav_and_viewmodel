package com.aungbophyoe.space.words.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("textData")
fun TextView.setData(key:Int){
    text = "Value : $key"
}