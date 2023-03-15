package com.ryanmichalkay.calculator

interface Validator {
    suspend fun validateExpression(exp: String): Boolean
}