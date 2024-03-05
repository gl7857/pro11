package com.example.pro11;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3;
    ImageView iv1,iv2,iv3;
    Button btn1,btn2,btn3,btn4;
    int num1,num2,num3,num4,sum1,sum2,sum3;
    int answer1, answer2,answer3;

    int counter = 0;
    public static Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);

        iv1= findViewById(R.id.iv1);
        iv2= findViewById(R.id.iv2);
        iv3= findViewById(R.id.iv3);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        startGame();

    }
    public void startGame() {

        num1 = rnd.nextInt(89) + 10;
        num2 = rnd.nextInt(89) + 10;

        tv1.setText(String.valueOf(num1));
        tv4.setText(String.valueOf(num2));

        et1.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.VISIBLE);
    }

    public void clicked1(View view) {

        String st = et1.getText().toString();
        if (st.isEmpty()){
            Toast.makeText(this, " please enter the answer!", Toast.LENGTH_SHORT).show();
        }else{

            answer1 = Integer.parseInt(st);
            sum1 = num1 + num2;
            iv1.setVisibility(View.VISIBLE);

            if (answer1==sum1){
                counter++;
                iv1.setImageResource(R.drawable.v2);
            } else {
                iv1.setImageResource(R.drawable.x1);
            }

            tv2.setText(String.valueOf(sum1));
            num3 = rnd.nextInt(89) + 10;
            tv5.setText(String.valueOf(num3));

            tv2.setVisibility(View.VISIBLE);
            tv5.setVisibility(View.VISIBLE);

            et2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
        }
    }

    public void clicked2(View view) {
        sum2 = sum1 + num3;
        String st1 = et2.getText().toString();

        if (st1.isEmpty()){
            Toast.makeText(this, " please enter the answer!", Toast.LENGTH_SHORT).show();
        }else {
            answer2 = Integer.parseInt(st1);

            iv2.setVisibility(View.VISIBLE);

            if (answer2 == sum2) {
                counter++;
                iv2.setImageResource(R.drawable.v2);
            } else {
                iv2.setImageResource(R.drawable.x1);
            }

            tv3.setText(String.valueOf(sum2));
            num4 = rnd.nextInt(89) + 10;
            tv6.setText(String.valueOf(num4));

            tv3.setVisibility(View.VISIBLE);
            tv6.setVisibility(View.VISIBLE);

            et3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
        }
    }

    public void clicked3(View view) {
        sum3 = sum2 + num4;
        String st2 = et3.getText().toString();
        if (st2.isEmpty()){
            Toast.makeText(this, " please enter the answer!", Toast.LENGTH_SHORT).show();
        }else{
            answer3 = Integer.parseInt(st2);

            iv3.setVisibility(View.VISIBLE);

            if (answer3==sum3) {
                counter++;
                iv3.setImageResource(R.drawable.v2);
            } else {
                iv3.setImageResource(R.drawable.x1);
            }
        }



        switch(counter){
            case 0:
                Toast.makeText(this, "your score: 0%, 0/3", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "your score: 33%, 1/3", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "your score: 66%, 2/3", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "your score: 100%, 3/3", Toast.LENGTH_SHORT).show();
                break;
        }

        btn4.setVisibility(View.VISIBLE);

    }

    public void clicked4(View view) {
        counter=0;
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);

        et1.setVisibility(View.INVISIBLE);
        et2.setVisibility(View.INVISIBLE);
        et3.setVisibility(View.INVISIBLE);

        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);


        et1.setText("");
        et2.setText("");
        et3.setText("");

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        startGame();
    }
}