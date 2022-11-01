package com.br.orcamento;

import com.br.orcamento.pedido.Acao.EnviarPedidoEmail;
import com.br.orcamento.pedido.Acao.SalvarPedidoNoBanco;
import com.br.orcamento.pedido.GeraPedidoHandler;
import com.br.orcamento.pedido.GerarPedido;
import com.br.orcamento.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestPedido {

    public static void main(String[] args) {

        GerarPedido gerarPedido = new GerarPedido("Ana", new BigDecimal(600),4);

        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBanco(),
                        new EnviarPedidoEmail()
                ));

        geraPedidoHandler.execute(gerarPedido);

    }
}
