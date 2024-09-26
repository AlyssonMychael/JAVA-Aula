package org.example;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuros) {
        super(titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void aplicarTaxas() {
        double juros = saldo * (taxaJuros / 100);
        saldo += juros;
        System.out.println("Juros de R$" + juros + " aplicados à conta poupança " + titular);
    }
}
