package com.mycompany.cuenta;

public class claseCuenta {
    private double saldo; //variable de instancia que almecena el saldo
    public claseCuenta(double saldoInicial)
    {
        if (saldoInicial>0.0)
        {
            saldo=saldoInicial;
        }
    }
    public void abonar(double monto)
    {
        saldo=saldo+monto;
    }
    public double obtenerSaldo()
    {
        return saldo;
    }
}