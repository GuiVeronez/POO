package Exercicios.exer06;

import java.util.Scanner;

public class Retangulo {

    Scanner ler = new Scanner(System.in);

    double base;
    double altura;

    public double calcularAreaRetangulo(){
        System.out.println("Entre com a base: ");
        base = ler.nextDouble();
        System.out.println("Entre com a altura: ");
        altura = ler.nextDouble();

        return base * altura;
    }
}