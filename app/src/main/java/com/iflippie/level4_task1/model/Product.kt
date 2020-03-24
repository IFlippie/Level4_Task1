package com.iflippie.level4_task1.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "productTable")
data class Product(

    @ColumnInfo(name = "product")
    var productText: String,

    @ColumnInfo(name = "amount")
    var amountText: Int,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

) : Parcelable