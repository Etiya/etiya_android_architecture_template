package com.etiya.template.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BaseEntity(
    @PrimaryKey
    val id: Int,
)