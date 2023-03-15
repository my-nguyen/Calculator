package com.ryanmichalkay.calculator

sealed class ResultWrapper<out E, out V> {
    data class Success<out V>(val value: V): ResultWrapper<Nothing, V>()
    data class Error<out E>(val error: E): ResultWrapper<E, Nothing>()

    companion object Factory {
        // copy-paste into the call site
        inline fun <V> build(function: () -> V): ResultWrapper<Exception, V> = try {
            Success(function.invoke())
        } catch (e: Exception) {
            Error(e)
        }
    }
}