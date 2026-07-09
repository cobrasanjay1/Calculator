package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testAddition() {
        onView(withId(R.id.et_a)).perform(typeText("10"), closeSoftKeyboard())
        onView(withId(R.id.et_b)).perform(typeText("5"), closeSoftKeyboard())
        onView(withId(R.id.btn_add)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("Result: 15.0")))
    }

    @Test
    fun testSubtraction() {
        onView(withId(R.id.et_a)).perform(typeText("10"), closeSoftKeyboard())
        onView(withId(R.id.et_b)).perform(typeText("5"), closeSoftKeyboard())
        onView(withId(R.id.btn_sub)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("Result: 5.0")))
    }

    @Test
    fun testMultiplication() {
        onView(withId(R.id.et_a)).perform(typeText("10"), closeSoftKeyboard())
        onView(withId(R.id.et_b)).perform(typeText("5"), closeSoftKeyboard())
        onView(withId(R.id.btn_mul)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("Result: 50.0")))
    }

    @Test
    fun testDivision() {
        onView(withId(R.id.et_a)).perform(typeText("10"), closeSoftKeyboard())
        onView(withId(R.id.et_b)).perform(typeText("5"), closeSoftKeyboard())
        onView(withId(R.id.btn_div)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("Result: 2.0")))
    }
}
