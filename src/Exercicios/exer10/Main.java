package Exercicios.exer10;

public class Main {

    public static void main(String[] args) {

        double area;

        Triangulo calculadoraAreaTriangulo = new Triangulo();
        area = calculadoraAreaTriangulo.CalculaAreaTriangulo();
        System.out.println("Area: " + area);
    }
}
