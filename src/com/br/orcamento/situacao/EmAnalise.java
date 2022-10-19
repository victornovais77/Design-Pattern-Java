package com.br.orcamento.situacao;

import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{


    public BigDecimal calculaDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(0.05));
    }

    public void aprovado(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }


    public void reprovado(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
