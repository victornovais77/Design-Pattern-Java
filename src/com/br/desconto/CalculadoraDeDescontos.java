package com.br.desconto;


import com.br.imposto.CalculadoraDeImpostos;
import com.br.orcamento.Orcamento;

import java.math.BigDecimal;


public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisDeCincoItens(
                new DescontoOrcamentoMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }


}
