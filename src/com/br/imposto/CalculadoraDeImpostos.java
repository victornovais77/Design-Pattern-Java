package com.br.imposto;

import com.br.loja.Orcamento;


import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcularOrcamento(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }

}
