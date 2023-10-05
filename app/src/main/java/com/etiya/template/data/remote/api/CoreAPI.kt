package com.etiya.template.data.remote.api

import com.etiya.template.data.model.request.BaseRequest
import com.etiya.template.data.model.response.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface CoreAPI {
    @GET("template/base")
    suspend fun getBaseService(request: BaseRequest): Response<BaseResponse>
}