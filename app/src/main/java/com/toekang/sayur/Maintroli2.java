package com.toekang.sayur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Maintroli2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troli2);
        getSupportActionBar().hide();

    }


    public void back5 (View view) {
        Intent i = new Intent( Maintroli2.this, DetailProduk.class);
        startActivity(i);
    }


}