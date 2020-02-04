package com.appli.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    Button plus = null;
    Button moins=null;
    Button fois=null;
    Button div=null;
    Button del=null;
    Button egual=null;
    Button delAll=null;
    TextView res = null;
    TextView signe =null;
    TextView FirstRes=null;


    int result=0;
    int premierNb=0;
    int tampon=0;
    int indice=20;

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
        plus=findViewById(R.id.buttonPlus);
        res=findViewById(R.id.Res);
        FirstRes=findViewById(R.id.premier);
        signe=findViewById(R.id.SigneOperation);
        moins=findViewById(R.id.buttonMoins);
        fois=findViewById(R.id.buttonMultipli);
        div=findViewById(R.id.buttonDivise);
        del=findViewById(R.id.buttonDel);
        egual=findViewById(R.id.buttonEqual);
        delAll=findViewById(R.id.buttonDellAll);

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+1;
                MajRes(tampon);
            }
        });
        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+2;
                MajRes(tampon);
            }
        });
        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+3;
                MajRes(tampon);
            }
        });
        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+4;
                MajRes(tampon);
            }
        });
        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+5;
                MajRes(tampon);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+6;
                MajRes(tampon);
            }
        });
        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+7;
                MajRes(tampon);
            }
        });
        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+8;
                MajRes(tampon);
            }
        });
        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10+9;
                MajRes(tampon);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=tampon*10;
                MajRes(tampon);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tampon==0){

                }
                else {
                    premierNb=tampon;
                    tampon=0;
                    MajRes(tampon);
                    MajResFirst(premierNb);
                    ChangeSigne("+");
                    indice=1;
                }
            }
        });
        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tampon==0){

                }
                else {
                    premierNb=tampon;
                    tampon=0;
                    MajRes(tampon);
                    MajResFirst(premierNb);
                    ChangeSigne("-");
                    indice=2;
                }
            }
        });
        fois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tampon==0){

                }
                else {
                    premierNb=tampon;
                    tampon=0;
                    MajRes(tampon);
                    MajResFirst(premierNb);
                    ChangeSigne("*");
                    indice=3;
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tampon==0){

                }
                else {
                    premierNb=tampon;
                    tampon=0;
                    MajRes(tampon);
                    MajResFirst(premierNb);
                    ChangeSigne("/");
                    indice=4;
                }
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampon=0;
                MajRes(0);
            }
        });
        delAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premierNb=0;
                ChangeSigne("");
                indice=20;
                tampon=0;
                MajResFirst("");
                MajRes(tampon);
            }
        });
        egual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (indice){
                    case 1:
                        result=premierNb+tampon;
                        ChangeSigne("");
                        MajResFirst("");
                        MajRes(result);
                        break;
                    case 2:
                        result=premierNb-tampon;
                        ChangeSigne("");
                        MajResFirst("");
                        MajRes(result);
                        break;
                    case 3:
                        result=premierNb*tampon;
                        ChangeSigne("");
                        MajResFirst("");
                        MajRes(result);
                        break;
                    case 4:
                        if(tampon==0){
                            popUp("Impossible de diviser par zéro");
                        }
                        else{
                            result=premierNb/tampon;
                            ChangeSigne("");
                            MajResFirst("");
                            MajRes(result);
                        }
                        break;
                }
            }
        });


    }
    void MajRes(int s){
        String x = ""+s;
        res.setText(x);
    }
    void ChangeSigne(String s){
        signe.setText(s);
    }
    void MajResFirst(int s){
        FirstRes.setText(""+s);
    }
    void MajResFirst(String s){
        FirstRes.setText(s);
    }
    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
