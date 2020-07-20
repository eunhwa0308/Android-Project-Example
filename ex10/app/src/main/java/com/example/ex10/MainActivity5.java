package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    ArrayList<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //데이터 생성
        data=new ArrayList<String>();
        data.add("그랜저");
        data.add("제네시스");

        //어댑터 생성
        final ArrayAdapter ad=ArrayAdapter.createFromResource(this,R.array.fruits,android.R.layout.simple_spinner_item);
        ad.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Sppinner에 어댑터 끼워넣기
        Spinner spinner=findViewById(R.id.spinner);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this,ad.getItem(i)+"는 맛있다",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final ArrayAdapter ad1=ArrayAdapter.createFromResource(this,R.array.foods,android.R.layout.simple_spinner_item);
        ad1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Sppinner에 어댑터 끼워넣기
        Spinner spinner1=findViewById(R.id.spinner1);
        spinner1.setAdapter(ad1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this,ad1.getItem(i)+"는 맛있다.",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        final ArrayAdapter ad2=ArrayAdapter.createFromResource(this,R.layout);
        ad2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Sppinner에 어댑터 끼워넣기
        Spinner spinner2=findViewById(R.id.spinner);
        spinner2.setAdapter(ad2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this,ad2.getItem(i)+"타고 싶다.",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}