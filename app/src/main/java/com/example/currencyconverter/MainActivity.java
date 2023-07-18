package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
Button btnClear, btnCalculate;
EditText edtInput;
RadioButton rdUSDtoBDT,rdBDTtoUSD,rdINRtoUSD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnClear = findViewById(R.id.btnClear);
        edtInput = findViewById(R.id.edtInput);
        rdUSDtoBDT = findViewById(R.id.rdUSDtoBDT);
        rdBDTtoUSD = findViewById(R.id.rdBDTtoUSD);
        rdINRtoUSD = findViewById(R.id.rdINRtoUSD);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input = new Double(edtInput.getText().toString());
                if(rdUSDtoBDT.isChecked()){
                    double result =  Convert.usdBDT(input);
                    edtInput.setText(new Double(result).toString());
                }
                else if(rdBDTtoUSD.isChecked()){
                    double result = Convert.bdtUSD(input);
                    edtInput.setText(new Double(result).toString());
                }
                else{
                    double result = Convert.inrUSD(input);
                    edtInput.setText(new Double(result).toString());
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText("");
            }
        });

    }
}