package com.br.orcamento;

import com.br.DomainException;
import com.br.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {

        this.http = http;
    }

    public void registrarOrcamento(Orcamento orcamento){
        if (!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não Finaizado!");
        }
        String url = "www.exemploAPI.com";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "Quantidade de Itens", orcamento.getQuantidadeItens()
        );
        http.post(url,dados);
    }
}
