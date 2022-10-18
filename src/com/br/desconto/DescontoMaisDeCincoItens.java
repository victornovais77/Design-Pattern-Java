package com.br.desconto;

import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto{

    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.05));
    }
}
