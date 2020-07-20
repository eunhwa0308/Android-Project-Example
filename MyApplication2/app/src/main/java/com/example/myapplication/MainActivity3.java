package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView list;
    ArrayList<Address> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //데이터 생성
        data=new ArrayList<>();
        Address address=new Address(R.drawable.hong,"홍길동","01012345678","인천 서구 경서동");
        data.add(address);
        address=new Address(R.drawable.sim,"심청이","01098765432","서울 강남구 압구정동");
        data.add(address);

        //어댑터 생성
        AddAdapter ad=new AddAdapter();
        //리스트 뷰에 어댑터 set
        list=findViewById(R.id.list);
        list.setAdapter(ad);

    }
    //어댑터 정의
    class AddAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.item_add,viewGroup,false);
            ImageView img=view.findViewById(R.id.img);
            img.setImageResource(data.get(i).img);
            TextView name=view.findViewById(R.id.name);
            name.setText(data.get(i).name);
            TextView tel=view.findViewById(R.id.tel);
            tel.setText(data.get(i).tel);
            TextView add=view.findViewById(R.id.add);
            add.setText(data.get(i).add);
            return view;
        }
    }

}