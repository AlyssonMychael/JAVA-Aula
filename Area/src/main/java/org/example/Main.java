package org.example;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo (5);
        Retangulo retangulo = new Retangulo(5, 10);

        circulo.exibirDescricao();
        circulo.exibirRaio();
        System.out.println("Área do circulo: " + circulo.calcularArea() + "\n");

        retangulo.exibirDescricao();
        retangulo.exibirDimensoes();
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
    }
}
