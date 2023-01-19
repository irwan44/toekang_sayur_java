package com.toekang.sayur;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class test2 extends AppCompatActivity {

    TextView  receiver_msg1, receiver_msg2, receiver_msg3,  receiver_msg4,  receiver_msg5, receiver_msg6 ;
    private Activity view;
    Uri imageUri;
    ImageView imageView;
    private Bitmap bitmap;
    private String uri;
    private android.widget.ImageView ImageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        getSupportActionBar().hide();

        imageView=(ImageView)findViewById(R.id.imageView1);

        receiver_msg1 = findViewById(R.id.received_value_id1);
        receiver_msg2 = findViewById(R.id.received_value_id2);
        receiver_msg3 = findViewById(R.id.received_value_id3);
        receiver_msg4 = findViewById(R.id.received_value_id4);
        receiver_msg5 = findViewById(R.id.received_value_id5);
        receiver_msg6 = findViewById(R.id.received_value_id6);

        // create the get Intent object
        Intent intent = getIntent();
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        String nmproduk2 = intent.getStringExtra("message_key1");
        String harga2 = intent.getStringExtra("message_key2");
        String stok2 = intent.getStringExtra("message_key3");
        String etalase2 = intent.getStringExtra("message_key4");
        String deskripsi2 = intent.getStringExtra("message_key5");
        String satuan2 = intent.getStringExtra("message_key6");
        Bitmap bitmap = intent.getParcelableExtra("BitmapImage");

        imageView.setImageBitmap(bitmap);
        receiver_msg1.setText(nmproduk2);
        receiver_msg2.setText(harga2);
        receiver_msg3.setText(stok2);
        receiver_msg4.setText(etalase2);
        receiver_msg5.setText(deskripsi2);
        receiver_msg6.setText(satuan2);

        }

    public void edit (View view) {
        Intent i = new Intent( test2.this, UploadProduck.class);
        startActivity(i);
    }
    public void lihat (View view) {
        Intent i = new Intent( test2.this, DetailProduk.class);
        startActivity(i);
    }
    public void back10 (View view) {
        Intent i = new Intent( test2.this, RegisterLanjut.class);
        startActivity(i);
    }
    }
