package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainPage extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    ImageButton btn;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        tv = findViewById(R.id.tv);
        tv1=findViewById(R.id.tv1);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
                case R.id.btn:
                    Intent intent= new Intent(MainPage.this, MainActivity.class);
                    setContentView(R.layout.custom);
                    Toast.makeText(MainPage.this, "Home Page", Toast.LENGTH_SHORT).show();
                    break;
        }
    }


}
