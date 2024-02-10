package com.example.androidmvvm

import android.util.Patterns

class User(
    var email: String,
    var password: String
) {
    fun isEmailValid(): Boolean{
        return email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isPasswordValid(): Boolean{
        return password.length >= 6
    }
}