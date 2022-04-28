package com.example.coursework_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Registation extends AppCompatActivity {

    EditText name, password, email;

    Button signUp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);


        getSupportActionBar().hide();
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);


//    void init(){
//        signUp = findViewById(R.id.sign_up);
//
    }
    public void Signup(View view) {

            signUp.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Registation.this, MainActivity.class));
                }
            });

            String userName = name.getText().toString();
            String userEmail = email.getText().toString();
            String userPassword = password.getText().toString();
            setContentView(R.layout.activity_main);

            if (TextUtils.isEmpty(userName)) {
                Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(userEmail)) {
                Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(userPassword)) {
                Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
                return;
            }

            if (userPassword.length() < 6) {
                Toast.makeText(this, "This Password too short,enter minimum 6 characters", Toast.LENGTH_SHORT).show();
                return;
            }

            Button btn = findViewById(R.id.sign_up);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }


        public void Signin (View view){
            Intent intent = new Intent(this,Login.class);
            startActivity(intent);

    }

}