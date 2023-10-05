package com.etiya.template.domain.usecases

import com.etiya.template.data.remote.utils.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException
import retrofit2.Response

open class BaseCase {
    private val noContent: String = "No any content found."
    val noInternet: String = "Couldn't reach server. Check your internet connection."
    val dispatcher: CoroutineDispatcher = Dispatchers.IO

    open fun <T> Response<T>.emit200(): Resource<T> {
        return if (isSuccessful) {
            val body = body()
            if (body != null) {
                Resource.Success(body)
            } else {
                Resource.Error(noContent)
            }
        } else {
            throw HttpException(this)
        }
    }
}