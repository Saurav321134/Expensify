package com.example.expensify.data.model


data class ExpenseSummary(
    val type: String,
    val date: String,
    val total_amount: Double
)