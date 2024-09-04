package com.example.androit_01.features.login.domain

interface LoginRepository {

    fun isValid(username: String, password: String): Boolean

}