package com.ced.cryptodaynews.presentation.coin_detail

import com.ced.cryptodaynews.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
