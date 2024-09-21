package Exercicios.exer05;

import java.util.Scanner;

public class Aluno {

    Scanner ler = new Scanner(System.in);

    String nome;
    int idade;

    public void lerDadosEImprimir(){
        System.out.println("Entre com o nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Entre com a idade do aluno: ");
        idade = ler.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}