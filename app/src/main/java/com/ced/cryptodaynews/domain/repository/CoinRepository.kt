package com.ced.cryptodaynews.domain.repository

import com.ced.cryptodaynews.data.remote.dto.CoinDetailDto
import com.ced.cryptodaynews.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}