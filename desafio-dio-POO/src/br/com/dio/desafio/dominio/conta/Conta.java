package br.com.dio.desafio.dominio.conta;

public abstract class Conta {

    private double saldo;

    protected Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void alterarSaldo(double valor) {
        this.saldo += valor;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            alterarSaldo(valor);
        }
    }

    public abstract void sacar(double valor);
}
