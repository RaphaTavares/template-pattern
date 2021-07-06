package com.company;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public double getRentabilidadeMensal(){
        return 0.01;
    }

    @Override
    public int getChequeEspecial(){
        return 2000;
    }
}