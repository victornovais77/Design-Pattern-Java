package com.br.orcamento;

import java.math.BigDecimal;

public class ItemOramento implements Orcavel {

    private BigDecimal valor;

    public ItemOramento(BigDecimal valor, int i) {
        this.valor = valor;
    }

    public ItemOramento(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }
}
