package com.etiya.template.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.etiya.template.data.model.BaseEntity
import com.etiya.template.data.remote.utils.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao : BaseDao<BaseEntity> {
    @Query("SELECT * FROM ${Constants.TABLE_NAME}")
    fun getEntity(): Flow<List<BaseEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEntity(entity: BaseEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateEntity(entity: BaseEntity)

    @Delete
    fun deleteEntity(entity: BaseEntity)

    @Query("DELETE FROM ${Constants.TABLE_NAME}")
    fun deleteAll()

}