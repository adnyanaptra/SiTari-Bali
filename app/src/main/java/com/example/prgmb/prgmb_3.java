package com.example.prgmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class prgmb_3 extends AppCompatActivity {
    ImageView imageView24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prgmb3);

        imageView24 = (ImageView) findViewById(R.id.imageView24);

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), prgmb4.class);
                startActivity(a);
            }
        });
    }
}