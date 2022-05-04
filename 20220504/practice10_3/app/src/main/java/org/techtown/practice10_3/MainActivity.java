package org.techtown.practice10_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    RadioButton add,sub,mul,div;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);

        add=(RadioButton) findViewById(R.id.add);
        sub=(RadioButton) findViewById(R.id.sub);
        mul=(RadioButton) findViewById(R.id.mul);
        div=(RadioButton) findViewById(R.id.div);

        cal=(Button) findViewById(R.id.cal);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int op1=Integer.parseInt(num1.getText().toString());
                int op2=Integer.parseInt(num2.getText().toString());
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);

                if(add.isChecked())
                {
                    intent.putExtra("opr","+");
                }
                else if(sub.isChecked())
                {
                    intent.putExtra("opr","-");
                }
                else if(mul.isChecked())
                {
                    intent.putExtra("opr","*");
                }
                else if(div.isChecked())
                {
                    intent.putExtra("opr","/");
                }
                else;

                intent.putExtra("num1",op1);
                intent.putExtra("num2",op2);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==0)
        {
            int sum=data.getIntExtra("sum",0);
            Toast.makeText(getApplicationContext(),"결과: "+sum,Toast.LENGTH_SHORT).show();

        }
    }
}