package br.com.dio.desafio.dominio.conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            alterarSaldo(-valor);
        }
    }
}
