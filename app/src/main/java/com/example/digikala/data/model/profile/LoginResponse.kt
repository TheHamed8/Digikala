package com.example.digikala.data.model.profile

data class LoginResponse(
    val id: String,
    val phone: String,
    val role: String,
    val token: String
)