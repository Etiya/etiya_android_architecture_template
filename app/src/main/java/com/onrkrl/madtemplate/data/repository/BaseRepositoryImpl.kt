package com.onrkrl.madtemplate.data.repository

import com.onrkrl.madtemplate.data.local.db.AppDatabase
import com.onrkrl.madtemplate.data.model.request.BaseRequest
import com.onrkrl.madtemplate.data.model.response.BaseResponse
import com.onrkrl.madtemplate.data.remote.api.CoreAPI
import com.onrkrl.madtemplate.domain.repository.BaseRepository
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