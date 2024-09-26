package org.example;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
    this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public void exibirRaio() {
        System.out.println("Raio do circulo: " + raio);
    }
}
