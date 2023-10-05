package com.etiya.template.data.repository

import com.etiya.template.data.local.db.AppDatabase
import com.etiya.template.data.model.request.BaseRequest
import com.etiya.template.data.model.response.BaseResponse
import com.etiya.template.data.remote.api.CoreAPI
import com.etiya.template.domain.repository.BaseRepository
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BaseRepositoryImpl @Inject constructor(
    private val api: CoreAPI,
    private val db: AppDatabase,

    ) : BaseRepository {
    private val dao = db.AppDao()
    override suspend fun getBaseService(request: BaseRequest): Response<BaseResponse> {
        return api.getBaseService(request)
    }
}