package com.example.androit_01.features.login.presentation

import androidx.lifecycle.ViewModel
import com.example.androit_01.features.login.domain.SignInUseCase

class LoginViewModel(private val signInUseCase: SignInUseCase) : ViewModel() {

    fun validateClicked(username: String , password: String):Boolean{

        val isValid = signInUseCase.invoke(username, password)

        println("el resultado es=>"+isValid)

        return isValid
    }

}