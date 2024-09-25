package Exercicios.exer07POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double area;
        double perimetro;
        int areaOuPerimetro;

        System.out.println("Você deseja calcular o perimetro ou a area do circulo? Digite 1 para area e 2 para perimetro. ");
        areaOuPerimetro = ler.nextInt();

        if (areaOuPerimetro == 1) {
            Circulo calculadoraAreaCirculo = new Circulo();
            area = calculadoraAreaCirculo.calcularAreaCirculo();
            System.out.println("Area: " + area);
        } else {
            Circulo calculadoraPerimetroCirculo = new Circulo();
            perimetro = calculadoraPerimetroCirculo.calcularPerimetroCirculo();
            System.out.println("Perimetro: " + perimetro);
        }
    }
}
