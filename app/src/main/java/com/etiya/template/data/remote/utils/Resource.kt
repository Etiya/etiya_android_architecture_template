package com.etiya.template.data.remote.utils

sealed class Resource<out T>(val data: T? = null, val message: String? = null) {
    class Idle<T> : Resource<T>()
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}