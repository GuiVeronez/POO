package Exercicios.exer04;

import java.util.Scanner;

public class Carro {

    Scanner ler = new Scanner(System.in);

    String modelo;
    int ano;
    String cor;
    int anoAtual = 2024;
    int idadeDoCarro;

    public void lerDadosEImprimirDados(){
        System.out.println("Entre com modelo: ");
        modelo = ler.nextLine();
        System.out.println("Entre com a cor: ");
        cor = ler.nextLine();
        System.out.println("Entre com o ano: ");
        ano = ler.nextInt();

        idadeDoCarro = anoAtual - ano;

        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Idade do Carro: " + idadeDoCarro + "Anos");
    }
}