package com.observelifedemo

import com.observelifedemo.utils.Utils
import org.junit.Assert.assertEquals
import org.junit.Test

class ResetPasswordTest {

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
}