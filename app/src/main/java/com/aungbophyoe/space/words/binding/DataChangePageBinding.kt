package com.aungbophyoe.space.words.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("textKey")
fun TextView.setText(key:Int){
    text = "$key"
}