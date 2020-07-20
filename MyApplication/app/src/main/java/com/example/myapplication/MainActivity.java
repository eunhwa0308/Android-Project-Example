package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image=findViewById(R.id.image);
                if(image.getVisibility()==View.VISIBLE) {
                    //사라지기
                    image.setVisibility(View.INVISIBLE);
                }else{
                    //보이기
                    image.setVisibility(View.VISIBLE);
                }
                TextView name=findViewById(R.id.name);
                if(name.getVisibility()==View.VISIBLE) {
                    //사라지기
                    name.setVisibility(View.INVISIBLE);
                }else{
                    //보이기
                    name.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}