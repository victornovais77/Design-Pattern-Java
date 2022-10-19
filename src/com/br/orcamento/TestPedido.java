package com.br.orcamento;

import com.br.orcamento.pedido.GeraPedidoHandler;
import com.br.orcamento.pedido.GerarPedido;
import com.br.orcamento.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestPedido {

    public static void main(String[] args) {

        GerarPedido gerarPedido = new GerarPedido("Ana", new BigDecimal(600),4);

        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler();

        geraPedidoHandler.execute(gerarPedido);

    }
}
