package ru.otus.daggerhomework

sealed class Result
data class Error(val throwable: Throwable): Result()
data class Success(val value: Int):Result()
