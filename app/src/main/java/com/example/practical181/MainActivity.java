package com.example.practical181;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button btn;String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1 = findViewById(R.id.e1);
                text=e1.getText().toString().trim();
                if(text.equals("www.google.com"))
                {
                    go();
                }
            }
        });
    }
    public void go()
    {
        Uri uri = Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}