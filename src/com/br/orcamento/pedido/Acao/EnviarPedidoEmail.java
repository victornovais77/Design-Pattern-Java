package com.br.orcamento.pedido.Acao;

import com.br.orcamento.pedido.Pedido;

public class EnviarPedidoEmail implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("enviando email com dados do pedido");
    }
}
