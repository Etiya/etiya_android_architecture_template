package com.etiya.template.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: List<T>)

    @Update
    fun update(data: T)

    @Delete
    fun delete(data: T)


}