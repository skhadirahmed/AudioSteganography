package com.reddy98.vishnuvardhan.audiosteganography;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class Main6Activity extends AppCompatActivity {

    private static final int REQUEST_PICK_FILE = 1;

    private TextView filePath;
    private Button Browse;
    private File selectedFile;
    Button browset;
    TextView textpath;
    File selectedt;
    Button enc;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filePath = (TextView)findViewById(R.id.file_path);
        Browse = (Button)findViewById(R.id.browse);



        Browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                    switch(v.getId())
                    {

                        case R.id.browse:
                            Intent intent = new Intent(Main6Activity.this, FilePicker.class);
                            startActivityForResult(intent, REQUEST_PICK_FILE);
                            break;
                    }
            }
        });

        textpath = findViewById(R.id.text_path);
        browset = findViewById(R.id.Browset);

        browset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {

                    case R.id.browse:
                        Intent intent = new Intent(Main6Activity.this, FilePicker.class);
                        startActivityForResult(intent, REQUEST_PICK_FILE);
                        break;
                }
            }
        });

        enc = findViewById(R.id.encrypt);

        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Main6Activity.this,Encryption.class);
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(resultCode == RESULT_OK) {

            switch(requestCode) {

                case REQUEST_PICK_FILE:

                    if(data.hasExtra(FilePicker.EXTRA_FILE_PATH)) {

                        selectedFile = new File
                                (data.getStringExtra(FilePicker.EXTRA_FILE_PATH));
                        filePath.setText(selectedFile.getPath());
                    }
                    break;
            }
        }
    }
}
