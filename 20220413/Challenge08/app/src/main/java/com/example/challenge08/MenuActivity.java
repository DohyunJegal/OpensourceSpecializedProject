package com.example.challenge08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    Button customerBtn, profitBtn, goodsBtn;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == 100) {
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        customerBtn = (Button) findViewById(R.id.customerBtn);
        profitBtn = (Button) findViewById(R.id.profitBtn);
        goodsBtn = (Button) findViewById(R.id.goodsBtn);

        customerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CustomerActivity.class);
                startActivityForResult(intent, 200);
            }
        });

        profitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProfitActivity.class);
                startActivityForResult(intent, 201);
            }
        });

        goodsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GoodsActivity.class);
                startActivityForResult(intent, 202);
            }
        });
    }
}
