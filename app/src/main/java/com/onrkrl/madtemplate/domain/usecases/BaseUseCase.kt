package com.onrkrl.madtemplate.domain.usecases

import com.onrkrl.madtemplate.data.model.request.BaseRequest
import com.onrkrl.madtemplate.data.model.response.BaseResponse
import com.onrkrl.madtemplate.data.remote.utils.Resource
import com.onrkrl.madtemplate.domain.repository.BaseRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class BaseUseCase @Inject constructor(
    private val repository: BaseRepository
) : BaseCase() {

    fun getBaseService(request: BaseRequest): Flow<Resource<BaseResponse>> = flow {
        try {
            emit(Resource.Loading())
            val data: Response<BaseResponse> =
                withContext(dispatcher) { repository.getBaseService(request) }
            emit(data.emit200())
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.message()))
        } catch (e: IOException) {
            emit(Resource.Error(noInternet))
        }
    }

}