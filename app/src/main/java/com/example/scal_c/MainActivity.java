package com.example.scal_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private EditText editTextText1;
    private EditText editTextText2;
    private EditText editTextText3;
    private EditText editTextText4;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        editTextText1 = findViewById(R.id.editTextText1);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);
        editTextText4 = findViewById(R.id.editTextText4);
        textView = findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ADDED", Toast.LENGTH_SHORT).show();
                String S1 = editTextText1.getText().toString();
                String S2 = editTextText2.getText().toString();
                double N1 = Double.parseDouble(S1);
                double N2 = Double.parseDouble(S2);
                double SUM = N1 + N2;
                textView.setText("RESULT:" + SUM);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SUBTRACTED", Toast.LENGTH_SHORT).show();
                String S2 = editTextText1.getText().toString();
                String S3 = editTextText2.getText().toString();
                double N2 = Double.parseDouble(S2);
                double N3 = Double.parseDouble(S3);
                double DIFF = N2 - N3;
                textView.setText("RESULT:" + DIFF);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "MULTIPLIED", Toast.LENGTH_SHORT).show();
                String S4 = editTextText1.getText().toString();
                String S5 = editTextText2.getText().toString();
                double N4 = Double.parseDouble(S4);
                double N5 = Double.parseDouble(S5);
                double PRD = N4 * N5;
                textView.setText("RESULT:" + PRD);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DIVIDED", Toast.LENGTH_SHORT).show();
                String S6 = editTextText1.getText().toString();
                String S7 = editTextText2.getText().toString();
                double N6 = Double.parseDouble(S6);
                double N7 = Double.parseDouble(S7);
                double DIV = N6 / N7;
                textView.setText("RESULT:" + DIV);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.sin(Math.toRadians(N)));
                textView.setText("RESULT:" + RES);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.cos(Math.toRadians(N)));
                textView.setText("RESULT:" + RES);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.tan(Math.toRadians(N)));
                textView.setText("RESULT:" + RES);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.sin(Math.toRadians(N)));
                Double RES1 = 1.0 / RES;
                textView.setText("RESULT:" + RES1);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.cos(Math.toRadians(N)));
                Double RES1 = 1.0 / RES;
                textView.setText("RESULT:" + RES1);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.tan(Math.toRadians(N)));
                Double RES1 = 1.0 / RES;
                textView.setText("RESULT:" + RES1);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.log(N));
                textView.setText("RESULT:" + RES);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.sqrt(N));
                textView.setText("RESULT:" + RES);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.cbrt(N));
                textView.setText("RESULT:" + RES);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                double N = Double.parseDouble(S);
                Double RES = (Math.pow(2.71, N));
                textView.setText("RESULT:" + RES);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                String S1 = editTextText4.getText().toString();
                double p = Double.parseDouble(S1);
                double N = Double.parseDouble(S);
                Double RES = (Math.pow(N, p));
                textView.setText("RESULT:" + RES);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PERFORMED", Toast.LENGTH_SHORT).show();
                String S = editTextText3.getText().toString();
                String S1 = editTextText4.getText().toString();
                double p = Double.parseDouble(S1);
                double N = Double.parseDouble(S);
                Double RES = (Math.pow(N,1/p));
                textView.setText("RESULT:" + RES);
            }
        });
    }
}