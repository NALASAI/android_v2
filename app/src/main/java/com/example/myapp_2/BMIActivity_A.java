package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BMIActivity_A extends AppCompatActivity {

    final static String TAG = BMIActivity_A.class.getName();

    Button btnBmi;

    EditText etHeight = null;
    EditText etWeight = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity_a);
        btnBmi = findViewById(R.id.btnBmi);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);

        btnBmi.setOnClickListener(view -> {

            if(etHeight.getText().length() < 1 || etWeight.getText().length() < 1){
                Log.d("TAG", "is Null");
                Toast.makeText(this, "빈 값이 있습니다", Toast.LENGTH_SHORT).show();
                return ;
            }else {
                Intent intent = new Intent(this, BMIActivity_B.class);

                int height = Integer.parseInt(etHeight.getText().toString());
                int weight = Integer.parseInt(etWeight.getText().toString());

                intent.putExtra("height", height);
                intent.putExtra("weight", weight);
                Log.d("TAG", "height : " + height);
                Log.d("TAG", "weight : " + weight);
                startActivity(intent);
            }
        });
    }
}