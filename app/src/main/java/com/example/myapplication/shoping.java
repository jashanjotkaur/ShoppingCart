package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class shoping extends AppCompatActivity implements View.OnClickListener {

    TextView Tv;
    TextView Tv2;
    RatingBar rv;
    Button btn22;
    ImageView Iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping);

        Iv=findViewById(R.id.Iv);
        Tv = findViewById(R.id.Tv);
        Tv2 = findViewById(R.id.Tv2);
        rv = findViewById(R.id.rv);
        btn22 = findViewById(R.id.btn22);

        btn22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn22:
                Intent intent = new Intent(shoping.this, Checkout.class);
                setContentView(R.layout.custom);
                Toast.makeText(shoping.this, "Sucess", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
