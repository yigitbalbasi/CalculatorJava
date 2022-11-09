package com.yigitb.calculatorjavav2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstInput;
    EditText secondInput;
    String firstStr;
    String secondStr;
    int inputNumber1;
    int inputNumber2;
    int result;
    String islem;
    TextView resultView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        islem = "";

        firstInput = findViewById(R.id.firstNumber);
        secondInput = findViewById(R.id.secondNumber);
        resultView = findViewById(R.id.resultText);
        Button toplamaButon = findViewById(R.id.buttonTopla);
        Button cikarmaButon = findViewById(R.id.buttonCikar);
        Button carpmaButon = findViewById(R.id.buttonCarp);
        Button bolmeButon = findViewById(R.id.buttonBol);
        Button esittirButon = findViewById(R.id.buttonEsittir);

        toplamaButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "topla";
                System.out.println(islem);
            }
        });

        cikarmaButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "cikar";
                System.out.println(islem);
            }
        });

        carpmaButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "carpma";
                System.out.println(islem);
            }
        });

        bolmeButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "bolme";
                System.out.println(islem);
            }
        });

        esittirButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                butonEsittir(view);
            }
        });

    }


    public void butonEsittir(View view) {

        firstStr = firstInput.getText().toString();
        secondStr = secondInput.getText().toString();

        System.out.println("first STring" + firstStr);
        System.out.println("second string" + secondStr);

        if (firstStr == null) {
            Toast.makeText(MainActivity.this, "U NEED TO ENTER 1st NUMBER", Toast.LENGTH_LONG);
        } else if (secondStr == null) {
            Toast.makeText(MainActivity.this, "U NEED TO ENTER 2nd NUMBER", Toast.LENGTH_LONG);
        } else {


            inputNumber1 = Integer.parseInt(firstStr);
            inputNumber2 = Integer.parseInt(secondStr);

            if (islem == "topla") {
                result = inputNumber1 + inputNumber2;
            } else if (islem == "cikar") {
                result = inputNumber1 - inputNumber2;
            } else if (islem == "carp") {
                result = inputNumber1 * inputNumber2;
            } else if (islem == "bol") {
                result = inputNumber1 / inputNumber2;
            }

            resultView.setText("Your Result:" + result);

        }


    }

}