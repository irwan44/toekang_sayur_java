package com.toekang.sayur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegisterLanjut extends AppCompatActivity {
    LinearLayout personalinfo, experience, review;
    TextView personalinfobtn, experiencebtn, reviewbtn;



    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_lanjut);
        getSupportActionBar().hide();


        personalinfo = findViewById(R.id.personalinfo);
        experience = findViewById(R.id.experience);
        review = findViewById(R.id.review);
        personalinfobtn = findViewById(R.id.personalinfobtn);
        experiencebtn = findViewById(R.id.experiencebtn);
        reviewbtn = findViewById(R.id.reviewbtn);
        /*making personal info visible*/
        personalinfo.setVisibility(View.VISIBLE);
        experience.setVisibility(View.GONE);
        review.setVisibility(View.GONE);


        personalinfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.VISIBLE);
                experience.setVisibility(View.GONE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.green));
                experiencebtn.setTextColor(getResources().getColor(R.color.gray));
                reviewbtn.setTextColor(getResources().getColor(R.color.gray));

            }
        });

        experiencebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                experience.setVisibility(View.VISIBLE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.gray));
                experiencebtn.setTextColor(getResources().getColor(R.color.green));
                reviewbtn.setTextColor(getResources().getColor(R.color.gray));

            }
        });

        reviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                experience.setVisibility(View.GONE);
                review.setVisibility(View.VISIBLE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.gray));
                experiencebtn.setTextColor(getResources().getColor(R.color.gray));
                reviewbtn.setTextColor(getResources().getColor(R.color.green));

            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView2);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AutoCompleteTextView textView2 = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView3);
        textView2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AutoCompleteTextView textView3 = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView6);
        textView3.setAdapter(adapter3);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AutoCompleteTextView textView4 = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView7);
        textView4.setAdapter(adapter4);
    }

    public void pilihPasar(String kota){
        if(kota.equals("2")){

        }

    }

    private static final String[] COUNTRIES = new String[] {
            "Pasar Tanah Abang Blok G", "Pasar Cipulir", "Pasar Glodok", "Pasar HWI Lindeteves","Pasar Tanah Abang (A-F)","Pasar Jatinegara","Pasar Senen Blok III dan VI","Pasar Minggu","Pasar Induk Kramat Jati","Pasar Kramat Jati","Pasar Kebayoran Lama","Pasar Tomang Barat","Pasar Perumnas Klender"
    };

    private static final String[] COUNTRIES2 = new String[] {
            "Jakarta Selatan", "Jakarta Timur", "Jakarta Barat", "Jakarta Utara", "Jakarta Pusat"
    };

    private static final String[] COUNTRIES3 = new String[] {
            "Motor Metic", "Motor Kopling"
    };
    private static final String[] COUNTRIES4 = new String[] {
            "Pasar Tanah Abang Blok G", "Pasar Cipulir", "Pasar Glodok", "Pasar HWI Lindeteves","Pasar Tanah Abang (A-F)","Pasar Jatinegara","Pasar Senen Blok III dan VI","Pasar Minggu","Pasar Induk Kramat Jati","Pasar Kramat Jati","Pasar Kebayoran Lama","Pasar Tomang Barat","Pasar Perumnas Klender"
    };
    public void back2 (View view) {
        Intent i = new Intent( RegisterLanjut.this, RegisterScreen.class);
        startActivity(i);
    }
    public void tambah (View view) {
        Intent i = new Intent( RegisterLanjut.this, UploadProduck.class);
        startActivity(i);
    }
    public void selesai1 (View view) {
        Intent i = new Intent( RegisterLanjut.this, HomeScreen.class);
        startActivity(i);
    }
    public void home22 (View view) {
        Intent i = new Intent( RegisterLanjut.this, FragmenHomeScreen.class);
        startActivity(i);
    }
    public void home23 (View view) {
        Intent i = new Intent( RegisterLanjut.this, FragmenHomeScreen.class);
        startActivity(i);
    }
    public void home24 (View view) {
        Intent i = new Intent( RegisterLanjut.this, FragmenHomeScreen.class);
        startActivity(i);
    }
    }
