package com.example.provaex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu();
    }

    public void Menu() {
        setContentView(R.layout.activity_main);
        Button btn1, btn2;

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculadora();

            }
       });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imc();
            }
        });


    }

    private void imc() {
        setContentView(R.layout.imc);
        Button btnConversao, btnVoltarConversao;
        final TextView txtCalculo;
        final TextView txtConversao;

        btnConversao = (Button) findViewById(R.id.btnConversao);
        btnVoltarConversao = (Button) findViewById(R.id.btnVoltarConversao);
        txtCalculo = (TextView) findViewById((R.id.txtCalculo));
        txtConversao = (TextView) findViewById(R.id.txtConversao);

        btnConversao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double C = Double.parseDouble(txtCalculo.getText().toString());
                double som = (C*1.8) + 32;

                txtConversao.setText ("A conversão de Cº para Fº é: " + som);
            }
        });
    }

    public void calculadora() {
        setContentView(R.layout.calculadora);
        final EditText txtAltura, txtPeso;
        Button btnCalcular, btnVoltar;
        final TextView txtCalculo;

        txtAltura = (EditText) findViewById(R.id.txtAltura);
        txtPeso = (EditText) findViewById((R.id.txtPeso));
        btnCalcular = (Button) findViewById((R.id.btnCalcular));
        btnVoltar = (Button) findViewById((R.id.btnVoltar));
        txtCalculo = (TextView) findViewById((R.id.txtCalculo));

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double altura = Double.parseDouble(txtAltura.getText().toString());
                double peso = Double.parseDouble(txtPeso.getText().toString());

                double soma = peso/(altura*altura);

                txtCalculo.setText("O Resultado IMC é:" + soma);

            }
            });
        btnVoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Menu();
            }
        });
    }
}