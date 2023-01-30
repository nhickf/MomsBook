package com.grpcx.core.data.repository

import com.grpcx.core.data.database.dao.ItemDao
import com.grpcx.core.data.database.dao.TransactionDao


class LocalSourceRepositoryImpl(val itemDao: ItemDao ,
                                val transactionDao: TransactionDao) : ILocalSourceRepository{

}
