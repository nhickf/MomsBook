package com.grpcx.listing.di

import com.grpcx.core.data.repository.ILocalSourceRepository
import com.grpcx.core.data.repository.LocalSourceRepositoryImpl
import com.grpcx.listing.data.repository.IListingRepository
import com.grpcx.listing.data.repository.ListingRepositoryImpl
import com.grpcx.listing.domain.ListingMainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val listingModule = module {


    single<ILocalSourceRepository> {
        LocalSourceRepositoryImpl()
    }

    single <IListingRepository>{
        ListingRepositoryImpl(
            localRepository = get()
        )
    }

    viewModel {
        ListingMainViewModel(
            repository = get()
        )
    }
}
