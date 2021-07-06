package com.company;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public int getChequeEspecial() {
        return 500;
    }


    public abstract double getRentabilidadeMensal();

    public double getRentabilidade12meses(){
        double rentabilidade = getRentabilidadeMensal();
        double montante = (saldo * Math.pow((1+rentabilidade), 12));

        return montante;
    }

    public String getBeneficios(){
        return "Você possui R$" + this.getChequeEspecial() + " de cheque especial e o montante da sua rentabilidade em 12 meses, tendo R$" + this.getSaldo() + " na conta, seria de R$" + this.getRentabilidade12meses();
    }


}