package domain

import java.util.Currency

data class Price (private val amount: Double, private val currency: Currency = Currency.getInstance("USD"))