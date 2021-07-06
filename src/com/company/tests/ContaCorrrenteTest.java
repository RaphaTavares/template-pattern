package com.company.tests;

import com.company.ContaCorrente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaCorrrenteTest {
    @Test
    public void deveRetornarRentabilidade(){
        ContaCorrente conta = new ContaCorrente(3000);
        assertEquals("Você possui R$2000 de cheque especial e o montante da sua rentabilidade em 12 meses, tendo R$3000.0 na conta, seria de R$3380.4750903959093", conta.getBeneficios());
    }
}
