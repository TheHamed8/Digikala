package com.example.digikala.repository

import com.example.digikala.data.model.home.AmazingItems
import com.example.digikala.data.model.product_detail.NewComment
import com.example.digikala.data.model.product_detail.ProductDetail
import com.example.digikala.data.remote.BaseApiResponse
import com.example.digikala.data.remote.NetworkResult
import com.example.digikala.data.remote.ProductDetailApiInterface
import javax.inject.Inject


class ProductDetailRepository @Inject constructor(
    private val api: ProductDetailApiInterface,
) : BaseApiResponse() {

    suspend fun getProductById(id: String): NetworkResult<ProductDetail> =
        safeApiCall {
            api.getProductById(id)
        }

    suspend fun getSimilarProducts(categoryId: String): NetworkResult<List<AmazingItems>> =
        safeApiCall {
            api.getSimilarProducts(categoryId)
        }

    suspend fun setNewComment(newComment: NewComment): NetworkResult<String> =
        safeApiCall {
            api.setNewComment(newComment)
        }

}
