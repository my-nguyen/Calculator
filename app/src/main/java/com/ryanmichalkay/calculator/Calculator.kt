package com.ryanmichalkay.calculator

interface Calculator {
    suspend fun evaluateExpression(exp: String, callback: (ResultWrapper<Exception, String>) -> Unit)
}