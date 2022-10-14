package com.br.desconto;

import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQueQuinhentos extends Desconto{

    public DescontoOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(new BigDecimal(500)) > 0){
            return orcamento.getValor().multiply(new BigDecimal(0.2));
        }

        return proximo.calcular(orcamento);
    }
}
