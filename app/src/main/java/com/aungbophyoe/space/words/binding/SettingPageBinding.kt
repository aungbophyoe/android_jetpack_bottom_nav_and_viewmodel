package com.aungbophyoe.space.words.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter

object SettingPageBinding {
    @BindingAdapter("textKey")
    fun TextView.setText(key:Int){
        text = "Value : $key"
    }
}