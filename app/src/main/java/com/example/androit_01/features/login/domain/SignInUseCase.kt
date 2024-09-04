package com.example.androit_01.features.login.domain

class SignInUseCase( private val loginRepository: LoginRepository) {

    //execute
    operator  fun invoke(username: String, password: String): Boolean{

        return  loginRepository.isValid(username, password)

    }
}