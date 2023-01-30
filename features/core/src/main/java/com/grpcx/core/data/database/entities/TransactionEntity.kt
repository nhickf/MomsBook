package com.grpcx.core.data.database.entities

import androidx.room.Entity
import java.util.UUID

@Entity
 data class TransactionEntity(
    val transactionId : String = UUID.randomUUID().toString()
)
