package com.observelifedemo.fragments

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.observelifedemo.R
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginFragmentTest {

    private lateinit var scenario: FragmentScenario<LoginFragment>

    @Before
    fun setup(){
        scenario = launchFragmentInContainer(themeResId = R.style.Theme_ObserveLifeDemo)
        scenario.moveToState(Lifecycle.State.RESUMED)
    }

    @Test
    fun testLogin(){
        val email = "nouman@gmail.com"
        val password = "12345678"
        onView(withId(R.id.edtEmail)).perform(typeText(email))
        onView(withId(R.id.edtPassword)).perform(typeText(password))
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.btnLogin)).perform(click())

    }
}