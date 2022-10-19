package com.br.orcamento.situacao;

import com.br.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizado(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
