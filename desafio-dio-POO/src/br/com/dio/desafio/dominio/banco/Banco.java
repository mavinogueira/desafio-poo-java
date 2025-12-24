package br.com.dio.desafio.dominio.banco;

import br.com.dio.desafio.dominio.conta.Conta;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarSaldos() {
        for (Conta conta : contas) {
            System.out.println(
                    conta.getClass().getSimpleName() +
                            " - Saldo: " + conta.getSaldo()
            );
        }
    }
}
