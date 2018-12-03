package com.reddy98.vishnuvardhan.audiosteganography;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class Main7Activity extends AppCompatActivity {

    private static final int REQUEST_PICK_FILE = 1;

    TextView audioPath;
    Button Browsee;
    File selectede;
    Button ext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        audioPath=findViewById(R.id.audio_path);
        Browsee=findViewById(R.id.broext);

        Browsee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                switch(v.getId())
                {

                    case R.id.browse:
                        Intent intent = new Intent(Main7Activity.this, FilePicker.class);
                        startActivityForResult(intent, REQUEST_PICK_FILE);
                        break;
                }
            }
        });

        ext = findViewById(R.id.extract);

        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main7Activity.this,extract.class);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(resultCode == RESULT_OK) {

            switch(requestCode) {

                case REQUEST_PICK_FILE:

                    if(data.hasExtra(FilePicker.EXTRA_FILE_PATH)) {

                        selectede = new File
                                (data.getStringExtra(FilePicker.EXTRA_FILE_PATH));
                        audioPath.setText(selectede.getPath());
                    }
                    break;
            }
        }
    }
}
