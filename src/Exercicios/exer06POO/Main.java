package Exercicios.exer06POO;

public class Main {

    public static void main(String[] args) {

        double area;

        Retangulo calculaArea = new Retangulo();
        area = calculaArea.calcularAreaRetangulo();

        System.out.println("A area do retangulo é: " + area);
    }
}