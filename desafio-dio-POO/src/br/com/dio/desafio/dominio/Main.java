package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.banco.Banco;
import br.com.dio.desafio.dominio.conta.*;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Conta cc = new ContaCorrente(100);
        Conta cp = new ContaPoupanca(100);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.sacar(20);
        cp.sacar(20);

        banco.listarSaldos();
    }
}
