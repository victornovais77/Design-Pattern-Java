package com.br.imposto;

import com.br.loja.Orcamento;

import java.math.BigDecimal;
import com.br.imposto.ISS;

public class Test {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcularOrcamento(orcamento, new ICMS()));
    }
}
