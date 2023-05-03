package com.example.tiptime



import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat


class TipCalculateTests {
    @Test
    fun calculate_20_percent_tip_no_roundup(){
        val amount = 10.00
        val percent = 20.00
        val expectedValue = NumberFormat.getCurrencyInstance().format(2)
        val actualValue = calculateTip(amount = amount, tipPercent = percent, roundUp = false)
        assertEquals(expectedValue,actualValue)
    }
}