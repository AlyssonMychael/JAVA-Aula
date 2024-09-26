package org.example;

public class ContaCorrente extends Conta {
    private double taxaMensal;

    public ContaCorrente(String titular, double saldoInicial, double taxaMensal) {
        super(titular, saldoInicial);
        this.taxaMensal = taxaMensal;
    }

    @Override
    public void aplicarTaxas() {
        saldo -= taxaMensal;
        System.out.println("Taxa mensal de R$" + taxaMensal + " aplicada à conta corrente de " + titular);
    }
}