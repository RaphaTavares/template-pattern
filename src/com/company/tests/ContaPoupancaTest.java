package com.company.tests;

import com.company.ContaPoupanca;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaPoupancaTest {
    @Test
    public void deveRetornarRentabilidade(){
        ContaPoupanca conta = new ContaPoupanca(3000);
        assertEquals("Você possui R$500 de cheque especial e o montante da sua rentabilidade em 12 meses, tendo R$3000.0 na conta, seria de R$5387.568978066391", conta.getBeneficios());
    }
}
