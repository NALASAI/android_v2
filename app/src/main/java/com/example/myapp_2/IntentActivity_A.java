package com.example.myapp_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class IntentActivity_A extends AppCompatActivity {

    //  final static String TAG = "TAG";
    // "IntentActivity_A"
    final  static String TAG = IntentActivity_A.class.getName();

    Button btnIntent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_a);
        Log.d(TAG, "onCreate");
        btnIntent1 = findViewById(R.id.btnIntent1);

        // 암시적 인탠트
//        btnIntent1.setOnClickListener(view -> {
//
//            // 시스템에게 요청할 Intent 생성
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
//            startActivity(intent);
//        });
        
        // 명시적 인텐트
//        btnIntent1.setOnClickListener(view -> {
//
//            // 시스템에게 요청할 Intent 생성
//            Intent intent = new Intent(this, IntentActivity_B.class);
//            startActivity(intent);
//        });

        // 명시적 인탠트 : 값 전달 방법
//        btnIntent1.setOnClickListener(view -> {
//            // 시스템에게 요청할 Intent 생성
//            Intent intent = new Intent(this, IntentActivity_B.class);
//            // 인탠트 객체에 값을 담아서 보낼 수 있다.
//            intent.putExtra("number1", 100);
//            intent.putExtra("number2", 200);
//            startActivity(intent);
//        });

        // 명시적 인탠트 : 값 전달하고 결과를 전달 받는 방법
        btnIntent1.setOnClickListener(view -> {
            // 시스템에게 요청할 Intent 생성
            Intent intent = new Intent(this, IntentActivity_B.class);
            // 인탠트 객체에 값을 담아서 보낼 수 있다.
            intent.putExtra("number1", 100);
            intent.putExtra("number2", 200);

            startActivityForResult(intent, 10001);
        });
    } // end of onCreate

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "요청 종류 확인");
        Log.d(TAG, "requestCode " + requestCode);
        Log.d(TAG, "resultCode " + resultCode);
        Log.d(TAG, "data " + data);

        int resultSum = data.getIntExtra("resultSum", 0);
        Log.d(TAG, "resultSum : " + resultSum);
    }
}