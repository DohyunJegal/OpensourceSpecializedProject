package org.techtown.practice10_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Intent intent=getIntent();
        String opr=intent.getStringExtra("opr");
        int sum=0;
        if(opr.equals("+"))
        {
            sum=intent.getIntExtra("num1",0)+intent.getIntExtra("num2",0);
        }
        else if(opr.equals("-"))
        {
            sum=intent.getIntExtra("num1",0)-intent.getIntExtra("num2",0);
        }
        else if(opr.equals("*"))
        {
            sum=intent.getIntExtra("num1",0)*intent.getIntExtra("num2",0);
        }
        else if(opr.equals("/"))
        {
            sum=intent.getIntExtra("num1",0)/intent.getIntExtra("num2",0);
        }
        else;

        Intent outintent=new Intent(getApplicationContext(),MainActivity.class);
        outintent.putExtra("sum",sum);
        setResult(0,outintent);
        finish();
    }
}
