package com.toekang.sayur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class DetailProduk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_screen);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    public void troli (View view) {
        Intent i = new Intent( DetailProduk.this, Maintroli2.class);
        startActivity(i);
    }
    public void back4 (View view) {
        Intent i = new Intent( DetailProduk.this, FragmenHomeScreen.class);
        startActivity(i);
    }


}