package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView page1=(TextView)findViewById(R.id.page1);
                if(page1.getVisibility()==View.VISIBLE) {
                    page1.setVisibility(View.INVISIBLE);
                }else{
                    page1.setVisibility(View.VISIBLE);
                }


            }
        }
    });

}