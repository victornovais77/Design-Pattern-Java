package com.br.desconto;

import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQueQuinhentos extends Desconto{

    public DescontoOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.1));
    }
}
