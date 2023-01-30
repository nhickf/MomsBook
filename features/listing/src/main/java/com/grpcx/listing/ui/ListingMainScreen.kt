package com.grpcx.listing.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.grpcx.listing.domain.ListingMainViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun ListingMainScreenRoute() {
    val listingMainViewModel = koinViewModel<ListingMainViewModel>()

    ListingMainScreen()
}

@Composable
internal fun ListingMainScreen() {
    ListingContent()
}
@Composable
internal fun ListingContent(){
    LazyColumn {
        items(5){
            ListItem()
        }
    }
}
