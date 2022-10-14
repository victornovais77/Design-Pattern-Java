package com.br.orcamento;

import java.math.BigDecimal;

public class Orcamento {

   private BigDecimal valor;
   private int quantidadeItens;

   public Orcamento (BigDecimal valor, int quantidadeItens){
        super();
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;

   }

    public BigDecimal getValor() {
       return valor;
    }

    public int getQuantidadeItens(){
       return quantidadeItens;
    }
}
