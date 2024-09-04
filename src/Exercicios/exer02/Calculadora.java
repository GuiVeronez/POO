package Exercicios.exer02;

import java.util.Scanner;

public class Calculadora {

    Scanner ler = new Scanner(System.in);

    double numero;

    public double dobroDoNumero(){
        System.out.println("Digite um numero para descobrir o dobro dele: ");
        numero = ler.nextDouble();
        numero *= 2;
        return numero;
    }
}
