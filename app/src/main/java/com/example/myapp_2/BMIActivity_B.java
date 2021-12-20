package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BMIActivity_B extends AppCompatActivity {

    TextView bmi;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity_b);

        // 인텐트
        // 값을 꺼내는 방법 : getIntent() 메서드 사용하면 된다.
        int height = getIntent().getIntExtra("height", 0);
        int weight = getIntent().getIntExtra("weight", 0);

        double bmiValue = weight / Math.pow(height / 100.0, 2);
        String resultValue = "";
        if(bmiValue < 18.5){
            resultValue = "저체중입니다";
        } else if(bmiValue < 23){
            resultValue = "정상체중입니다";
        } else if(bmiValue < 25){
            resultValue = "과체중입니다";
        } else if(bmiValue < 30){
            resultValue = "경도비만입니다";
        } else if(bmiValue < 35){
            resultValue = "중정도비만입니다";
        } else{
            resultValue = "고도비만입니다";
        }

        bmi.setText(String.valueOf(bmiValue));
        result.setText(String.valueOf(resultValue));
    }
}