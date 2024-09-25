package Exercicios.exer10POO;

import java.util.Scanner;

public class Triangulo {

    Scanner ler = new Scanner(System.in);

    double base;
    double altura;

    public double CalculaAreaTriangulo(){

        System.out.println("Entre com a base do triangulo: ");
        base = ler.nextDouble();

        System.out.println("Entre com a altura do triangulo: ");
        altura = ler.nextDouble();

        return base * altura / 2;
    }
}
