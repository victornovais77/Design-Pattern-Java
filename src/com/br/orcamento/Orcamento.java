package com.br.orcamento;

import com.br.orcamento.situacao.EmAnalise;
import com.br.orcamento.situacao.Finalizado;
import com.br.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

   private BigDecimal valor;
   private int quantidadeItens;
   private SituacaoOrcamento situacao;
   private List<Orcavel> itens;

   public Orcamento(){
        super();
        this.itens = new ArrayList<Orcavel>();
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
   }

    public Orcamento(BigDecimal valorOrcamento, int quantidadeItens) {
       this.valor = valorOrcamento;
       this.quantidadeItens = quantidadeItens;
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

       return itens.size();
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

    public void adicionarItens(Orcavel item){
       this.valor = valor.add(item.getValor());
       this.itens.add(item);
    }
}
