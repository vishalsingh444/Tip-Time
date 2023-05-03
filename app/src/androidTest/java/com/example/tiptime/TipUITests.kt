package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {
    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun calculate_20_percent_tip(){
        composeTestRule.setContent{
            TipTimeTheme {
                TipTimeScreen()
            }
        }
        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        val exceptedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Tip Amount: $exceptedTip").assertExists("No node with text was found.")
    }
}
