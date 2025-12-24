package br.com.dio.desafio.dominio.conta;

public class ContaCorrente extends Conta {

    private static final double TAXA_SAQUE = 2.0;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double total = valor + TAXA_SAQUE;
        if (valor > 0 && getSaldo() >= total) {
            alterarSaldo(-total);
        }
    }
}
