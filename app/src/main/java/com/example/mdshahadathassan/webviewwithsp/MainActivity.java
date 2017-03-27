package com.example.mdshahadathassan.webviewwithsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWeb,btnAsset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWeb=(Button)findViewById(R.id.Web);
        btnAsset=(Button)findViewById(R.id.Asset);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this,LoadWebActivity.class);
                in.putExtra("data","Web");
                startActivity(in);
            }
        });
        btnAsset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,LoadWebActivity.class);
                in.putExtra("data","Asset");
                startActivity(in);
            }
        });
    }
}
