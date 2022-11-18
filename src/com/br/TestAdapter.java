package com.br;

import com.br.http.ApacheHttpAdapter;
import com.br.http.JavaHttpAdapter;
import com.br.orcamento.ItemOramento;
import com.br.orcamento.Orcamento;
import com.br.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class TestAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItens(new ItemOramento(BigDecimal.TEN, 1));

        orcamento.aprovar();
        orcamento.finalizado();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new ApacheHttpAdapter());


        registro.registrarOrcamento(orcamento);


    }
}
