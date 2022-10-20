package com.br.orcamento.pedido.Acao;

import com.br.orcamento.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Salva pedido no banco de dados");
    }
}
