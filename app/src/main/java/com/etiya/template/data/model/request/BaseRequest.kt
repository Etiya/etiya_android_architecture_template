package com.etiya.template.data.model.request

import com.google.gson.annotations.SerializedName

data class BaseRequest(
    @SerializedName("base")
    val base: String? = null,
)