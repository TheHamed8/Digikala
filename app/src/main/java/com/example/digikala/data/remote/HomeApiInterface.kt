package com.example.digikala.data.remote

import com.example.digikala.data.model.ResponseResult
import com.example.digikala.data.model.home.AmazingItems
import com.example.digikala.data.model.home.Category
import com.example.digikala.data.model.home.Slider
import retrofit2.Response
import retrofit2.http.GET

interface HomeApiInterface {

    @GET("v1/getSlider")
    suspend fun getSlider(): Response<ResponseResult<List<Slider>>>

    @GET("v1/getAmazingProducts")
    suspend fun getAmazingItems(): Response<ResponseResult<List<AmazingItems>>>

    @GET("v1/getSuperMarketAmazingProducts")
    suspend fun getSuperMarketAmazingProducts(): Response<ResponseResult<List<AmazingItems>>>

    @GET("v1/get4Banners")
    suspend fun getProposalBanners(): Response<ResponseResult<List<Slider>>>

    @GET("v1/getCategories")
    suspend fun getCategories(): Response<ResponseResult<List<Category>>>

    @GET("v1/getCenterBanners")
    suspend fun getCenterBanners(): Response<ResponseResult<List<Slider>>>

    @GET("v1/getBestsellerProducts")
    suspend fun getBestsellerProducts(): Response<ResponseResult<List<AmazingItems>>>

    @GET("v1/getMostVisitedProducts")
    suspend fun getMostVisitedProducts(): Response<ResponseResult<List<AmazingItems>>>

    @GET("v1/getMostFavoriteProducts")
    suspend fun getMostFavoriteProducts(): Response<ResponseResult<List<AmazingItems>>>

    @GET("v1/getMostDiscountedProducts")
    suspend fun getMostDiscountedProducts(): Response<ResponseResult<List<AmazingItems>>>

}