package com.example.androit_01.features.login.presentation;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androit_01.R;

public class LoginActivity2 extends AppCompatActivity {

    void setupView(){
        Button button = findViewById(R.id.action_validate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
