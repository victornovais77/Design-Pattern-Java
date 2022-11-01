package com.br.orcamento.pedido;

import com.br.orcamento.Orcamento;
import com.br.orcamento.pedido.Acao.AcaoAposGerarPedido;
import com.br.orcamento.pedido.Acao.EnviarPedidoEmail;
import com.br.orcamento.pedido.Acao.SalvarPedidoNoBanco;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List <AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GerarPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
