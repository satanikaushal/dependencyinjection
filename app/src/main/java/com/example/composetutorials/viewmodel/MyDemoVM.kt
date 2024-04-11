package com.example.composetutorials.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.composetutorials.di.HelloKartik
import com.example.composetutorials.di.HelloWorld
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyDemoVM @Inject constructor(
    private val application: Application,
    @HelloWorld name : String,
    @HelloKartik kartik : String,
): ViewModel() {
    init {
        println(
            name
        )
        println(
            kartik
        )
    }
}