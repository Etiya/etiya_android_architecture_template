package com.etiya.template.domain.repository

import com.etiya.template.data.model.request.BaseRequest
import com.etiya.template.data.model.response.BaseResponse
import retrofit2.Response

interface BaseRepository {
    suspend fun getBaseService(request: BaseRequest): Response<BaseResponse>
}