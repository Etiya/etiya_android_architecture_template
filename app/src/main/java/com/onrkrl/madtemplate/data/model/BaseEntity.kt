package com.onrkrl.madtemplate.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BaseEntity constructor(
    @PrimaryKey
    val id: Int,
)