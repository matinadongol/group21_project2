package com.example.android.testing.espresso.BasicSample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {
    companion object {
        val DEFAULT_STRING = "Hello Espresso!"
        val STRING_TO_BE_TYPED = "123"
        val STRINGL_TO_BE_TYPED2 = "abcdef"
        val EMPTY_STRING = ""
    }
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun validateStringsInTextView() {
        onView(withId(R.id.textToBeChanged)).check(matches(withText(DEFAULT_STRING)))
    }
}