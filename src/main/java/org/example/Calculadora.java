package org.example;

public class Calculadora {

    //Instanciar de alguna manera
    //Dependencia
    CalculadoraOracleCloud calcOc;

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double sumarEnOracleCloud(double a, double b) {
        //Sumar en la nube
        return calcOc.sumar(a, b);
    }
}
