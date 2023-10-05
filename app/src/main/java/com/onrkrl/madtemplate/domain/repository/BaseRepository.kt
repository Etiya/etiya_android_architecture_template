package com.onrkrl.madtemplate.domain.repository

import com.onrkrl.madtemplate.data.model.request.BaseRequest
import com.onrkrl.madtemplate.data.model.response.BaseResponse
import retrofit2.Response

interface BaseRepository {
    suspend fun getBaseService(request: BaseRequest): Response<BaseResponse>
}