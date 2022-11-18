package com.br;

import com.br.desconto.CalculadoraDeDescontos;
import com.br.orcamento.ItemOramento;
import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDescontos {
    public static void main(String[] args) {
        Orcamento primeiro_orcamento = new Orcamento();
        primeiro_orcamento.adicionarItens(new ItemOramento(new BigDecimal(1000),7));

        Orcamento segundo_orcamento = new Orcamento();
        segundo_orcamento.adicionarItens(new ItemOramento(new BigDecimal(400),7));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro_orcamento));
        System.out.println(calculadora.calcular(segundo_orcamento));
    }
}
