package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class IntentActivity_B extends AppCompatActivity {

    public static final String TAG = IntentActivity_B.class.getName();

    TextView tvResultA;
    TextView tvResultB;
    Button btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_b);
        initData(); // 메서드 호출
        // 인탠트
        // 값을 꺼내는 방법
        int number1 = getIntent().getIntExtra("number1", 0);
        int number2 = getIntent().getIntExtra("number2", 0);

        // number1 + number2 = 결과를 A 화면에 돌려주기
        
        tvResultA.setText(String.valueOf(number1));
        tvResultB.setText(String.valueOf(number2));

        btnEnd.setOnClickListener(view -> {

            Intent intent = new Intent();
            intent.putExtra("resultSum", number1 + number2);

            // 값을 되돌려 보낼때 사용하는 매서드
            setResult(Activity.RESULT_OK, intent);

            // 화면을 종료 시키는 방법
            finish();
        });
    }

    private void initData(){
        
        tvResultA = findViewById(R.id.tvResult1);
        tvResultB = findViewById(R.id.tvResult2);
        btnEnd = findViewById(R.id.btnEnd);
    }
}