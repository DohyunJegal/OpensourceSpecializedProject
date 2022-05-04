package org.techtown.practice10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rdoSecond,rdoThird;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoSecond=(RadioButton) findViewById(R.id.rdoSecond);
        rdoThird=(RadioButton) findViewById(R.id.rdoThird);
        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(rdoSecond.isChecked())
                {
                    intent=new Intent(getApplicationContext(),SecondActivity.class);
                }
                else
                {
                    intent=new Intent(getApplicationContext(),ThirdActivity.class);
                }

                startActivity(intent);
            }
        });
    }
}