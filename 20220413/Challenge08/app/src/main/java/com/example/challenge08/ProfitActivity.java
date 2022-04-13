package com.example.challenge08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfitActivity extends AppCompatActivity {
    Button goMenu, goLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit);

        goMenu = (Button) findViewById(R.id.goMenu2);
        goLogin = (Button) findViewById(R.id.goLogin2);

        goMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                setResult(100, intent);
                finish();
            }
        });
    }
}