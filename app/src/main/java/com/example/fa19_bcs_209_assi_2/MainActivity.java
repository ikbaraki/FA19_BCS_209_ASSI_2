package com.example.fa19_bcs_209_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int Try;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button back;
    Button open;
    String password;
    Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clear=findViewById(R.id.clear);
        password="007";
        Try=0;
        one=findViewById(R.id.first);
        two=findViewById(R.id.second);
        three=findViewById(R.id.third);
        four=findViewById(R.id.fourth);
        five=findViewById(R.id.fifth);
        six=findViewById(R.id.sixth);
        seven=findViewById(R.id.seventh);
        eight=findViewById(R.id.eighth);
        nine=findViewById(R.id.nineth);
        zero=findViewById(R.id.Zero);
        back=findViewById(R.id.back);
        open=findViewById(R.id.open);
        textView=findViewById(R.id.textView);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Append("0");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m= textView.getText().toString();
//                char [] a=m.toCharArray();
//                int size=a.length;
//                char [] b= new char[a.length];
//                for(int i=0; i==a.length-2;i++)
//                {b[i]=a[i];
//                }
//                String n= String.valueOf(b);

                if(!m.isEmpty()){
                    StringBuffer sb= new StringBuffer(m);
                    sb.deleteCharAt(sb.length()-1);
                    System.out.println(sb);
                    textView.setText(sb);
                }
                else
                    Toast.makeText(MainActivity.this, "There is nothing to delete!", Toast.LENGTH_SHORT).show();

            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), messageAct.class);
                if (textView.getText().toString().equals(password))
                    startActivity(intent);
                else if (Try==3)
                    finish();
                else
                {Toast.makeText(MainActivity.this, "Code is incorrect!", Toast.LENGTH_SHORT).show();
                    Try++;}
            }
        });
    }
    public void Append(String s){
        textView.append(s);
    }

}