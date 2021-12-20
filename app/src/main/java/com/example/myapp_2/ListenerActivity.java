package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListenerActivity extends AppCompatActivity {

    ImageView imageView1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        // 뷰를 activity 로 가져오는 방법
        // 1. findViewById
        // 2. view Binding 방법
        TextView tvHello = findViewById(R.id.tvHello);

        // 이벤트 리스너 등록
//        tvHello.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Log.d("TAG", "onClick ~~~~");
//                Log.d("TAG", view.getId() + "");
//                Log.d("TAG", view.getTag().toString());
//            }
//        });

        tvHello.setOnClickListener(view -> {
            Log.d("TAG", "onClick ~~~~");
            Log.d("TAG", view.getId() + "");
            Log.d("TAG", view.getTag().toString());

            // 예) 네트워크 통신 후 값을 뷰에 셋팅
            tvHello.setText("글자를 변경해 줍니다");
        });
//        tvHello.setOnClickListener(view -> Log.d("TAG", "onClick ~~~~"));

        imageView1 = findViewById(R.id.imageView1);
        imageView1.setOnClickListener(view -> {
            imageView1.setImageResource(R.drawable.ic_image_1);
        });

    }
}