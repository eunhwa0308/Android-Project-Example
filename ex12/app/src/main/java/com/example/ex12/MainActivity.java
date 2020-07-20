package com.example.ex12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<Address> data;
    AddAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //데이터 생성
        data=new ArrayList<>();
        Address address=new Address("홍길동","인천 서구");
        data.add(address);
        address=new Address("심청이","서울 강남구");
        data.add(address);
        address=new Address("강감찬","충남 아산시");
        data.add(address);
        address=new Address("신은화","전북 전주시");
        data.add(address);
        address=new Address("이몽룡","경기도 부흥시");
        data.add(address);
        address=new Address("성춘향","경기도 시흥시");
        data.add(address);



        //어댑터 생성
        ad=new AddAdapter();

        //리스트 뷰에 어댑터 set
        list=findViewById(R.id.list);
        list.setAdapter(ad);
    }
    //AddAdapter 정의
    public class AddAdapter extends BaseAdapter{

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
        public View getView(final int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.item,viewGroup,false);
            final TextView name=view.findViewById(R.id.name);
            name.setText(data.get(i).name);
            TextView add=view.findViewById(R.id.add);
            add.setText(data.get(i).add);

            Button btn=view.findViewById(R.id.btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("질의");
                    String strName=name.getText().toString();
                    alert.setMessage(strName+"을(를)삭제하시겠습니까?");
                    alert.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i1) {
                            data.remove(i);
                            ad.notifyDataSetChanged();

                        }
                    });
                    alert.setNegativeButton("아니오",null);
                    alert.show();
                }
            });

            return view;
        }
    }
}