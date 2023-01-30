package com.grpcx.listing.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grpcx.listing.data.model.Item
import com.grpcx.listing.data.repository.IListingRepository
import kotlinx.coroutines.flow.*


internal class ListingMainViewModel(
    val repository: IListingRepository
) : ViewModel(){


    private val _listingState : MutableStateFlow<ListingState> = MutableStateFlow(ListingState.Loading)
    val listingState : StateFlow<ListingState> = flow {
        emit(_listingState.value)
    }.onCompletion {
        emit(ListingState.Done)
    }.catch {
        emit(ListingState.Error)
    }.stateIn(
        scope = viewModelScope,
        initialValue = ListingState.Loading,
        started = SharingStarted.WhileSubscribed(5_000)
    )

    fun newState(){
        _listingState.value = ListingState.ListItem(emptyList())
    }

}

internal sealed interface ListingState {
    object Loading : ListingState
    object Error : ListingState
    object Done : ListingState
    data class ListItem( val items : List<Item>) : ListingState
}
