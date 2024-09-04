package com.example.androit_01.features.login.presentation

import androidx.lifecycle.ViewModel
import com.example.androit_01.features.login.data.LoginDataRepository
import com.example.androit_01.features.login.data.remote.LonginModRemoteDataSource
import com.example.androit_01.features.login.domain.LoginRepository
import com.example.androit_01.features.login.domain.SignInUseCase

class LoginFactory {

    private val logInModRemoteDataSource: LonginModRemoteDataSource= provideLoginRemoteDataSouerce()
    private val loginRepository : LoginRepository=provideLoginDataRepository()
    private val signInUseCase: SignInUseCase = provideSignInUseCase()

    fun provideLoginViewModel(): LoginViewModel {
        return LoginViewModel(signInUseCase)
    }

    fun provideLoginRemoteDataSouerce(): LonginModRemoteDataSource{
        return LonginModRemoteDataSource()
    }

    private fun provideLoginDataRepository(): LoginDataRepository{
        return LoginDataRepository(logInModRemoteDataSource)
    }

    private fun provideSignInUseCase(): SignInUseCase{
        return SignInUseCase(loginRepository );
    }
}