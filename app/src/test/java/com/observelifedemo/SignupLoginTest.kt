package com.observelifedemo

import com.observelifedemo.utils.Utils
import org.junit.Assert.assertEquals
import org.junit.Test

class SignupLoginTest {

    @Test
   fun validateEmail_blankInput_expectedRequiredField(){
       val result = Utils().validateEmail("")
       assertEquals("Email is required", result)
   }

    @Test
    fun validateEmail_invalidInput_expectedValidationMsg(){
        val result = Utils().validateEmail("abc")
        assertEquals("Invalid Email", result)
    }

    @Test
    fun validateEmail_validInput_expectedValidationMsg(){
        val result = Utils().validateEmail("abc@gmail.com")
        assertEquals("Valid Email", result)
    }

    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        val result = Utils().validatePassword("","")
        assertEquals("Password is required", result)
    }

    @Test
    fun validatePassword_passwordNotMatch_expectedValidationMsg(){
        val result = Utils().validatePassword("11111111","1111111")
        assertEquals("Passwords doesn't match", result)
    }

    @Test
    fun validatePassword_validInput_expectedValidationMsg(){
        val result = Utils().validatePassword("11111111","11111111")
        assertEquals("Valid Password", result)
    }
}