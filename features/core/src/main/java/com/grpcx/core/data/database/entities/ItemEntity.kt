package com.grpcx.core.data.database.entities

import androidx.room.Entity

@Entity
 data class ItemEntity(
    val itemName : String,
    val itemPrice : String,
    val transactionId : String
)
