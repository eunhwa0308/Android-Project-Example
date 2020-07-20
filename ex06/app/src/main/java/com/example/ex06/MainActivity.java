package com.example.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image);
        findViewById(R.id.btm1).setOnLongClickListener(mLong);
        findViewById(R.id.btm2).setOnLongClickListener(mLong);
        findViewById(R.id.btm3).setOnLongClickListener(mLong);
        findViewById(R.id.btm4).setOnLongClickListener(mLong);
        findViewById(R.id.btm5).setOnLongClickListener(mLong);

        int cnt = 100;
        int sum=0;

        //1~100까지 합을 토스트로 출력
        for(int i=1; i <cnt; i++){
            sum = sum+i;
            System.out.println(sum);
//            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        }
    }

    //롱클릭메서드
    Button.OnLongClickListener mLong=new View.OnLongClickListener() {
        String str;
        @Override
        public boolean onLongClick(View view) {
            switch (view.getId()){
                case R.id.btm1:
                    str="1번째 이미지입니다.";
                    break;
                case R.id.btm2:
                    str="2번째 이미지입니다.";
                    break;
                case R.id.btm3:
                    str="3번째 이미지입니다.";
                    break;
                case R.id.btm4:
                    str="4번째 이미지입니다.";
                    break;
                case R.id.btm5:
                    str="5번째 이미지입니다.";
                    break;
            }
            Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            return false;
        }
    };
    //클릭이벤트
    public void mClick(View v) {
        switch (v.getId()) {
            case R.id.btm1:
                image.setImageResource(R.drawable.car1);
                break;
            case R.id.btm2:
                image.setImageResource(R.drawable.car2);
                break;
            case R.id.btm3:
                image.setImageResource(R.drawable.car3);
                break;
            case R.id.btm4:
                image.setImageResource(R.drawable.car4);
                break;
            case R.id.btm5:
                image.setImageResource(R.drawable.car5);
                break;
        }
    }
}