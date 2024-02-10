package com.example.androidmvvm

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel(
    var user: User
): BaseObservable() {
    val messageLogin: ObservableField<String> = ObservableField()
    fun onClickLogin(){
        if (user.isEmailValid() && user.isPasswordValid()) {
            messageLogin.set("Login success")
        }
        else {
            messageLogin.set("Email or Password invalid")
        }
    }
}