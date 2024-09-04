package com.example.androit_01.features.login.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.androit_01.R
import com.example.androit_01.databinding.ActivityLoginBinding
import java.util.Objects

class LoginActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLoginBinding

    private lateinit var loginFactory : LoginFactory
    private lateinit var loginViewModel : LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginFactory= LoginFactory()
        loginViewModel = loginFactory.provideLoginViewModel()

        setupView()

    }

    private fun setupView(){
       val actionValidate =  findViewById<Button>(R.id.action_validate)
        actionValidate.setOnClickListener {
            Log.d("@dev" ,  "hola caracola")
            var x= it as Button
            // x.text = "je je"

            val userName = findViewById<EditText>(R.id.input_username).text.toString()

            val password = findViewById<EditText>(R.id.input_password).text.toString()

           // println(userName+ " === "+ password)

            if ( loginViewModel.validateClicked(userName, password)){
                x.text="correcto"

                Snackbar.make(findViewById(R.id.main), R.string.mensaje_login_ok, Snackbar.LENGTH_SHORT).show()
            }else{
                x.text="falso"
                Snackbar.make(findViewById(R.id.main), R.string.mensaje_login_false, Snackbar.LENGTH_SHORT).show()
            }







        }




    }


}