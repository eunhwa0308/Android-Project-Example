package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity4 extends AppCompatActivity {
    ProgressBar pro1,pro2;
    int mYear,mMonth,mDay,mHour,mMinute;
    TextView date,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        pro1=findViewById(R.id.pro1);
        pro2=findViewById(R.id.pro2);
        date=findViewById(R.id.date);
        time=findViewById(R.id.time);

        Calendar cal=new GregorianCalendar();
        mYear=cal.get(Calendar.YEAR);
        mMonth=cal.get(Calendar.MONTH);
        mDay=cal.get(Calendar.DAY_OF_MONTH);
        mHour= cal.get(Calendar.HOUR);
        mMinute=cal.get(Calendar.MINUTE);
        updateNow();
    }

    //날짜 출력 메서드
    private void updateNow(){
        date.setText(String.format("%d-%d-%d",mYear,mMonth+1,mDay));
        time.setText(String.format("%d시%d분",mHour,mMinute));
    }

    public void mClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                pro1.incrementProgressBy(-10);
                break;
            case R.id.btn2:
                pro1.incrementProgressBy(+10);
                break;
            case R.id.btn3:
                pro2.setVisibility(View.VISIBLE);
                break;
            case R.id.btn4:
                pro2.setVisibility(View.INVISIBLE);
                break;
            case R.id.date:
                new DatePickerDialog(MainActivity4.this,mDatSet,mYear,mDay,mDay).show();
                break;
            case R.id.time:
                new TimePickerDialog(MainActivity4.this,mTimeSet,mHour,mMinute,false).show();
                break;
        }
    }
    //날짜 변경 리스너
    DatePickerDialog.OnDateSetListener mDatSet=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            mYear=i;
            mMonth=i1;
            mDay=i2;
            updateNow();
        }
    };
    //시간 변경 리스너
    TimePickerDialog.OnTimeSetListener mTimeSet=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            mHour=i;
            mMinute=i1;
            updateNow();
        }
    };
}