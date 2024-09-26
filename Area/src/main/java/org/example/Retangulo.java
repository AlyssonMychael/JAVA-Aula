package org.example;

public class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    public void exibirDimensoes() {
        System.out.println("Largura: " + largura + "\n" + "Altura: " + altura);
    }
}
