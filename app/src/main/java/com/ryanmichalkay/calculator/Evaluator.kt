package com.ryanmichalkay.calculator

interface Evaluator {
    suspend fun evaluateExpression(exp: String): ResultWrapper<Exception, String>
}