package com.example.ex16;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        name=findViewById(R.id.name);

        Intent intent=getIntent();
        String strText=text.getText().toString();
        intent.putExtra("text",strText);
        text.setText(strText);
        setResult();
        startActivityForResult(intent,1);


    }

}