package com.company;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public double getRentabilidadeMensal(){
        return 0.05;
    }
}