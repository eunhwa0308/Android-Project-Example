package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ListView list1;
    ArrayList<String> data;
    ArrayList<String> data1;
    ArrayList<String> data2;
    Spinner spin;
    Spinner spin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        list1=findViewById(R.id.list1);
        spin=findViewById(R.id.spin);
        spin2=findViewById(R.id.spin2);

        //데이터 생성
        data=new ArrayList<>();
        data.add("바나나");
        data.add("포도");
        data.add("키위");
        data1=new ArrayList<>();
        data1.add("초코");
        data1.add("바닐라");
        data1.add("딸기");
        data2=new ArrayList<>();
        data2.add("축구");
        data2.add("농구");
        data2.add("야구");


        //어댑터 생성
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,data);

        //리스트 뷰에 어댑터 끼워넣기 (어댑터 set)
        list.setAdapter(ad);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        ArrayAdapter ad1=new ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,data1);

        list1.setAdapter(ad1);
        list1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter ad2=new ArrayAdapter(this,android.R.layout.simple_spinner_item,data2);
        ad2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        spin.setAdapter(ad2);
        spin2.setAdapter(ad2);




    }
}