package com.grpcx.core.data.repository

import com.grpcx.core.data.database.entities.ItemEntity

interface ILocalSourceRepository {
    suspend fun getItems() : List<ItemEntity>
}
