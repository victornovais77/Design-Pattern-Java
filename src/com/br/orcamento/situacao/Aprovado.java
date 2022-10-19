package com.br.orcamento.situacao;

import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calculaDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(0.02));
    }

    public void finalizado(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
