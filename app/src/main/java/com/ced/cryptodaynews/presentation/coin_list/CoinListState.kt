package com.ced.cryptodaynews.presentation.coin_list

import com.ced.cryptodaynews.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
