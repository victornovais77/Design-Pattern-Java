package com.br.orcamento.pedido;

import com.br.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // Injeção de Dependencias: Repository, Service, API etc...
    public GeraPedidoHandler() {
    }

    public void execute(GerarPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);
    }
}
