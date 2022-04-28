package com.example.coursework_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void signIn (View view){
        startActivity(new Intent(Login.this,MainActivity.class));

    }
    public void signUp (View view){
        startActivity(new Intent(Login.this,Registation.class));

    }
}