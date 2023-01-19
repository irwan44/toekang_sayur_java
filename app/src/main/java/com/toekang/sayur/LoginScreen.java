package com.toekang.sayur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        getSupportActionBar().hide();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }
    }

    public void Register (View view) {
        Intent i = new Intent( LoginScreen.this, RegisterScreen.class);
        startActivity(i);
    }
    public void home2 (View view) {
        Intent i = new Intent( LoginScreen.this, FragmenHomeScreen.class);
        startActivity(i);
    }
    }
