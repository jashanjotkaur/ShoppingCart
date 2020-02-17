package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Checkout extends AppCompatActivity implements View.OnClickListener {

    TextView Tv;
    TextView Tv2;
    RatingBar rv;
    Button btninc;
    Button btndec;
    ImageView Iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping);

        Iv = findViewById(R.id.Iv);
        Tv = findViewById(R.id.Tv);
        Tv2 = findViewById(R.id.Tv2);
        rv = findViewById(R.id.rv);
        btninc = findViewById(R.id.btninc);
        btndec = findViewById(R.id.btndec);

        btninc.setOnClickListener(this);
        btndec.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btninc:

                Toast.makeText(Checkout.this, "Home Page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btndec:

                Toast.makeText(Checkout.this, "Home Page", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
