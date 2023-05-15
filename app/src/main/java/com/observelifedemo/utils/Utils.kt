package com.observelifedemo.utils

class Utils {

    fun validateEmail(input: String) = when{
        input.isBlank() -> {
            "Email is required"
        }
        !input.contains("@") -> {
            "Invalid Email"
        }
        else -> {
            "Valid Email"
        }
    }

    fun validatePassword(password: String, confirmPassword: String) = when{
        password.isBlank() || confirmPassword.isBlank()-> {
            "Password is required"
        }
        password != confirmPassword -> {
            "Passwords doesn't match"
        }
        else -> {
            "Valid Password"
        }
    }

}