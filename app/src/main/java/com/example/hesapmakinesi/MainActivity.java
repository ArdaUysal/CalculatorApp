package com.example.hesapmakinesi;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected Button addition,subtraction,multiplication,division,equal,ac,yuzde,delete;
    protected Button nine,eight,seven,six,five,four,three,two,one,zero,doubleZero,comma;
    protected TextView process,result;
    private boolean add,subtrac,multiply,div,yuzde1;

    private float number1,number2;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        equal = findViewById(R.id.equal);
        ac = findViewById(R.id.ac);
        yuzde = findViewById(R.id.yuzde);
        delete = findViewById(R.id.delete);
        nine = findViewById(R.id.nine);
        eight = findViewById(R.id.eight);
        seven = findViewById(R.id.seven);
        six = findViewById(R.id.six);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        three = findViewById(R.id.three);
        two = findViewById(R.id.two);
        one = findViewById(R.id.one);
        zero = findViewById(R.id.zero);
        doubleZero = findViewById(R.id.doubleZero);
        comma = findViewById(R.id.comma);
        process = findViewById(R.id.process);
        result = findViewById(R.id.result);

        doubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"00");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                add = true;
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                subtrac = true;
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                multiply = true;
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                div = true;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add){
                    number2 = Float.parseFloat(result.getText().toString());
                    result.setText(String.valueOf(number1 + number2));
                    process.setText(number1 + "+" + number2);
                    add = false;
                }
                if (subtrac){
                    number2 = Float.parseFloat(result.getText().toString());
                    result.setText(String.valueOf(number1 - number2));
                    process.setText(number1 + "-" + number2);
                    subtrac = false;
                }
                if (multiply){
                    number2 = Float.parseFloat(result.getText().toString());
                    result.setText(String.valueOf(number1 * number2));
                    process.setText(number1 + "x" + number2);
                    multiply = false;
                }
                if (div){
                    number2 = Float.parseFloat(result.getText().toString());
                    result.setText(String.valueOf(number1 / number2));
                    process.setText(number1 + "÷" + number2);
                    div = false;
                }
                if(yuzde1){
                    result.setText(String.valueOf(number1 / 100));
                    process.setText(number1  +" %");
                    yuzde1 = false;
                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                process.setText("");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer erase = new StringBuffer(result.getText());
                erase.reverse();
                erase.deleteCharAt(0);
                erase.reverse();
                String _result = new String(erase);
                result.setText(_result);
            }
        });

        yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(result.getText().toString());
                yuzde1 = true;
            }
        });

        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + ".");
            }
        });


    }
}