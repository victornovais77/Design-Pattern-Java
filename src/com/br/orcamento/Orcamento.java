package com.br.orcamento;

import com.br.orcamento.situacao.EmAnalise;
import com.br.orcamento.situacao.Finalizado;
import com.br.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

   private BigDecimal valor;
   private int quantidadeItens;
   private SituacaoOrcamento situacao;

   public Orcamento (BigDecimal valor, int quantidadeItens){
        super();
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();

   }

    public void aplicaDesconto(){
        BigDecimal valorDoDescontoExtra = this.situacao.calculaDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
       this.situacao.aprovado(this);
    }

    public void reprovar(){

       this.situacao.reprovado(this);
    }

    public void finalizado(){

       this.situacao.finalizado(this);
    }

    public BigDecimal getValor() {
       return valor;
    }

    public int getQuantidadeItens(){
       return quantidadeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
       return situacao instanceof Finalizado;
    }
}
