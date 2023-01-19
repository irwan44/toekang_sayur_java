package com.toekang.sayur;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class UploadProduck extends AppCompatActivity implements View.OnClickListener {


    public static String IMAGE_RES_ID_KEY;
    public static Bitmap bmp;
    CardView send_button;
    EditText nmproduk, harga, stok, etalase, deskripsi, satuan;
    ImageView upload ;

    private static final int PICK_IMAGE_REQUEST = 234;
    
    //Buttons
    private Button buttonChoose;
    private Button buttonUpload;

    //ImageView
    private ImageView imageView;
    Uri imageUri;
    //a Uri object to store file path
    private Uri filePath;
    private Intent in1;
    public static final int PICK_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_produck);
        getSupportActionBar().hide();


        send_button = findViewById(R.id.send_button_id1);
        nmproduk = findViewById(R.id.nmproduk1);
        harga = findViewById(R.id.harga1);
        stok = findViewById(R.id.stok1);
        etalase = findViewById(R.id.etalase1);
        deskripsi = findViewById(R.id.deskripsi1);
        satuan = findViewById(R.id.satuan1);
        upload = (ImageView) findViewById(R.id.imageView);

        buttonChoose = (Button) findViewById(R.id.buttonChoose);
        buttonUpload = (Button) findViewById(R.id.buttonUpload);

        imageView = (ImageView) findViewById(R.id.imageView);


        buttonChoose.setOnClickListener(this);
        buttonUpload.setOnClickListener(this);


        // add the OnClickListener in sender button after clicked this button following Instruction will run
            send_button.setOnClickListener(v -> {
            // get the value which input by user in EditText and convert it to string
            String nmproduk2 = nmproduk.getText().toString();
            String harga2 = harga.getText().toString();
            String stok2 = stok.getText().toString();
            String etalase2 = etalase.getText().toString();
            String deskripsi2 = deskripsi.getText().toString();
            String satuan2 = satuan.getText().toString();




            // Create the Intent object of this class Context() to Second_activity class
            Intent intent = new Intent(getApplicationContext(), test2.class);
            // now by putExtra method put the value in key, value pair key is
            // message_key by this key we will receive the value, and put the string
            intent.putExtra("message_key1", nmproduk2);
            intent.putExtra("message_key2", harga2);
            intent.putExtra("message_key3", stok2);
            intent.putExtra("message_key4", etalase2);
            intent.putExtra("message_key5", deskripsi2);
            intent.putExtra("message_key6", satuan2);
            intent.putExtra("BitmapImage", bmp);



            // start the Intent
            startActivity(intent);
        });

    }
    private void showFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }




    //handling the image chooser activity result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
            try {
                bmp = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                imageView.setImageBitmap(bmp);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onClick(View view) {
        //if the clicked button is choose
        if (view == buttonChoose) {
            showFileChooser();
        }
        //if the clicked button is upload
        else if (view == buttonUpload) {

        }
    }

}