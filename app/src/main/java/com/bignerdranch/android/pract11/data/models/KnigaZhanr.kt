package com.bignerdranch.android.pract11.data.models

import android.provider.BaseColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bignerdranch.android.pract11.data.BOOKS_ZHANR_TABLE
import java.util.*

@Entity(tableName =  BOOKS_ZHANR_TABLE)
data class KnigaZhanr(
    @PrimaryKey(autoGenerate = false)
    val id: UUID,
    @ColumnInfo(index =  true)
    var typeId: UUID,
    var zhanr: String,
    var buyDate: Date
)
