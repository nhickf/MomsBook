package com.grpcx.core.data.database.source

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.grpcx.core.data.database.dao.ItemDao
import com.grpcx.core.data.database.dao.TransactionDao
import com.grpcx.core.data.database.entities.ItemEntity
import com.grpcx.core.data.database.entities.TransactionEntity

@Database(entities = [ItemEntity::class, TransactionEntity::class], version = 1, exportSchema = false)
internal abstract class AppDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
    abstract fun transactionDao(): TransactionDao

    companion object{
        @Volatile
        private var INSTANCE  : AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {
            return INSTANCE ?: synchronized(this){
                val instance = Room
                    .databaseBuilder(context.applicationContext,
                                     AppDatabase::class.java,
                                     "momscook")
                    .build()

                INSTANCE = instance

                instance
            }
        }
    }

}
