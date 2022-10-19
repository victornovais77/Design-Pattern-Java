package com.br.orcamento.situacao;

import com.br.DomainException;
import com.br.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calculaDescontoExtra(Orcamento orcamento){
       return BigDecimal.ZERO;
    }

    public void aprovado(Orcamento orcamento){
        throw new DomainException("Orçamento não Pode ser Aprovado");
    }

    public void reprovado(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser Reprovado");
    }

    public void finalizado(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser Finalizado");
    }
}
