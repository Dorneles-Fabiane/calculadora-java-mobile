package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String sN1 = "";
    private String sN2 = "";
    private String operacao = "";
    int resultado = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao1 (View v) {
        atualizarNumeroDigitado("1");

        atualizarDisplay("1");
    }

    public void onClickBotao2 (View v) {
        atualizarNumeroDigitado("2");

        atualizarDisplay("2");
    }

    public void onClickBotao3 (View v) {
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");
    }

    public void onClickBotao4 (View v) {
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");
    }

    public void onClickBotao5 (View v) {
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");
    }

    public void onClickBotao6 (View v) {
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }

    public void onClickBotao7 (View v) {
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }

    public void onClickBotao8 (View v) {
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }

    public void onClickBotao9 (View v) {
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }

    public void onClickBotao0 (View v) {
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public void onClickAdicao (View v) {
        operacao = "+";
        atualizarDisplay("+");
    }

    public void onClickSubtracao(View v) {
        operacao = "-";
        atualizarDisplay("-");
    }

    public void onClickMultiplic (View v) {
        operacao = "x";
        atualizarDisplay("X");
    }

    public void onClickDivisao(View v) {
        operacao = "/";
        atualizarDisplay("/");
    }

    public void onClickIgual (View v) {
        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);

        if (operacao.equals("+")) {
            resultado = n1 + n2;
            display.setText(String.valueOf(resultado));
        } else if (operacao.equals("-")) {
            resultado = n1- n2;
            display.setText(String.valueOf(resultado));
        } else if (operacao.equals("x")) {
            resultado = n1 * n2;
            display.setText(String.valueOf(resultado));
        } else if (operacao.equals("/")) {
            resultado = n1 / n2;
            display.setText(String.valueOf(resultado));
        }
    }

    public void atualizarDisplay(String texto) {
        String textoDisplay = display.getText().toString();

        textoDisplay+= texto;

        display.setText(textoDisplay);
    }

    public void atualizarNumeroDigitado(String numero) {
        if (operacao.isEmpty()) {
            sN1 += numero;
        } else {
            sN2 += numero;
        }
    }

    public void onClickLimpar (View v) {
        sN1 = "";
        sN2 = "";
        display.setText("");
    }
}

