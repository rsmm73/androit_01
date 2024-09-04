package com.example.androit_01.features.login.data.remote

class LonginModRemoteDataSource {

    private val username= "android"
    private val password = "12345"

    fun validate(username:String, password: String):Boolean{
        println(username+"=========="+password)
        return (this.username==username) && (this.password==password)
    }
}