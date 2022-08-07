package com.ced.cryptodaynews.data.repository

import com.ced.cryptodaynews.data.remote.CoinPaprikaApi
import com.ced.cryptodaynews.data.remote.dto.CoinDetailDto
import com.ced.cryptodaynews.data.remote.dto.CoinDto
import com.ced.cryptodaynews.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}