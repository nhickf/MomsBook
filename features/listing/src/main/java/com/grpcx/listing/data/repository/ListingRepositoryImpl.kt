package com.grpcx.listing.data.repository

import com.grpcx.core.data.repository.ILocalSourceRepository

class ListingRepositoryImpl(
    val localRepository: ILocalSourceRepository
) : IListingRepository {

}
