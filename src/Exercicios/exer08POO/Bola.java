package Exercicios.exer08POO;

import java.util.Scanner;

public class Bola {

    Scanner ler = new Scanner(System.in);

    String cor;
    String material;
    double diametro;

    public void LeEImprimeAsInformacoes(){
        System.out.println("Entre com a cor da bola: ");
        cor = ler.nextLine();
        System.out.println("Entre com o material: ");
        material = ler.nextLine();
        System.out.println("Entre com o diametro: ");
        diametro = ler.nextDouble();

        System.out.println("Cor: " + cor);
        System.out.println("Material: " + material);
        System.out.println("Diametro: " + diametro);
    }
}
