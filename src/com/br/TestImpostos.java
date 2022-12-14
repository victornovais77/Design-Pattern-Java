package com.br;

import com.br.imposto.CalculadoraDeImpostos;
import com.br.imposto.ICMS;
import com.br.imposto.ISS;
import com.br.orcamento.ItemOramento;
import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItens(new ItemOramento(new BigDecimal(100),6));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcularOrcamento(orcamento, new ICMS(new ISS(null))));
    }
}
