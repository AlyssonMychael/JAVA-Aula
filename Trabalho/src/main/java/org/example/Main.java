package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor("Thiago", 12000, 1500);
        Funcionario gerente = new Gerente("Alysson", 20000, 2000);

        System.out.println("Salário do Desenvolvedor " + dev.getNome() + ": " + dev.calcularSalario());
        System.out.println("Salário do Gerente " + gerente.getNome() + ": " + gerente.calcularSalario());
    }   
}
