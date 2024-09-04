package com.example.androit_01.features.login.data

import com.example.androit_01.features.login.data.remote.LonginModRemoteDataSource
import com.example.androit_01.features.login.domain.LoginRepository

class LoginDataRepository(private val remoteDataSource: LonginModRemoteDataSource): LoginRepository {

    override fun isValid(username: String, password: String): Boolean {
        return remoteDataSource.validate(username, password)

    }
}