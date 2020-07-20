package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name=findViewById(R.id.name);
                String strName=name.getText().toString();

                EditText add=findViewById(R.id.add);
                String stradd=name.getText().toString();

                String str=strName+"/n"+stradd;
                Toast.makeText(SubActivity.this, strName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}