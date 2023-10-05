package com.onrkrl.madtemplate.data.remote.api

import com.onrkrl.madtemplate.data.model.request.BaseRequest
import com.onrkrl.madtemplate.data.model.response.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface CoreAPI {
    @GET("template/base")
    suspend fun getBaseService(request: BaseRequest): Response<BaseResponse>
}