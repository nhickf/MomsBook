package com.grpcx.momsbook

import android.app.Application
import com.grpcx.listing.di.listingModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)

            modules(
                listOf(
                    listingModule
                )
            )
        }
    }
}
