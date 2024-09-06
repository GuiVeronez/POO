package Exercicios.exer07;

import java.util.Scanner;

public class Circulo {

    Scanner ler = new Scanner(System.in);

    double raio;
    double pi = 3.14159;

    public double calcularAreaCirculo(){

        System.out.println("Entre com o raio: ");
        raio = ler.nextDouble();

        return pi * (raio * raio);
    }

    public double calcularPerimetroCirculo(){

        System.out.println("Entre com o raio: ");
        raio = ler.nextDouble();

        return 2 * pi * raio;
    }
}
