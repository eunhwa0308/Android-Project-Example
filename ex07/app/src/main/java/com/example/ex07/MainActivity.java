package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        findViewById(R.id.btn1).setOnLongClickListener(mLong);
        findViewById(R.id.btn2).setOnLongClickListener(mLong);
        findViewById(R.id.btn3).setOnLongClickListener(mLong);
    }

    //클릭메서드
    public void mClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                text.setTextColor(Color.GREEN);
                text.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.btn2:
                text.setTextColor(Color.RED);
                text.setBackgroundColor(Color.BLUE);
                break;
            case R.id.btn3:
                text.setTextColor(Color.BLUE);
                text.setBackgroundColor(Color.WHITE);
                break;
        }
    }

    //롱클릭
    Button.OnLongClickListener mLong=new Button.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {
            String str="";
            switch (v.getId()){
                case R.id.btn1:
                    str="첫번째 버튼";
                    break;
                case R.id.btn2:
                    str="두번째 버튼";
                    break;
                case R.id.btn3:
                    str="세번째 버튼";
                    break;
            }
            Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            return false;
        }
    };
}