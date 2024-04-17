package com.carmen.retrofit.data


import com.carmen.retrofit.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}