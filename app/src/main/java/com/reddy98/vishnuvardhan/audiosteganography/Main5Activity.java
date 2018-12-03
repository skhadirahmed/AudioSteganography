package com.reddy98.vishnuvardhan.audiosteganography;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    Button emb;
    Button ext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        emb=findViewById(R.id.button4);
        ext=findViewById(R.id.button5);

        emb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,Main6Activity.class);
            }
        });
        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,Main7Activity.class);
            }
        });
    }
}
