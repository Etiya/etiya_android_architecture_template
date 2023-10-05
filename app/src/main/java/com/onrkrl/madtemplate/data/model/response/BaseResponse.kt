package com.onrkrl.madtemplate.data.model.response

import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("base")
    val base: String? = null,
)