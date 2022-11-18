package com.br;

import com.br.orcamento.ItemOramento;
import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItens(new ItemOramento(new BigDecimal(200)));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItens(new ItemOramento(new BigDecimal(500)));
        novo.adicionarItens(antigo);

        System.out.println(novo.getValor());


    }
}
