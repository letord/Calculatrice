package com.appli.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button un = null;
    Button deux = null;
    Button trois = null;
    Button quatre = null;
    Button cinq = null;
    Button six = null;
    Button sept = null;
    Button huit = null;
    Button neuf = null;
    Button zero = null;
    TextView res = null;
    int result=0;
    int tampon=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=findViewById(R.id.button1);
        deux=findViewById(R.id.button2);
        trois=findViewById(R.id.button3);
        quatre=findViewById(R.id.button4);
        cinq=findViewById(R.id.button5);
        six=findViewById(R.id.button6);
        sept=findViewById(R.id.button7);
        huit=findViewById(R.id.button8);
        neuf=findViewById(R.id.button9);
        zero=findViewById(R.id.button0);
        res=findViewById(R.id.Res);
        MajRes();
        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+1;
            }
        });
        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+2;
            }
        });
        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+3;
            }
        });
        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+4;
            }
        });
        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+5;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+6;
            }
        });

    }
    void MajRes(){
        res.setText(result);
    }
}
