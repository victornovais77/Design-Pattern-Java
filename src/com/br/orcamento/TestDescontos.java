package com.br.orcamento;

import com.br.desconto.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TestDescontos {
    public static void main(String[] args) {
        Orcamento primeiro_orcamento = new Orcamento(new BigDecimal(1000),3);
        Orcamento segundo_orcamento = new Orcamento(new BigDecimal(400),7);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro_orcamento));
        System.out.println(calculadora.calcular(segundo_orcamento));
    }
}
