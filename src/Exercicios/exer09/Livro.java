package Exercicios.exer09;

import java.util.Scanner;

public class Livro {

    Scanner ler = new Scanner(System.in);

    String titulo;
    String autor;
    double paginas;
    double anoPublicacao;
    double paginasPorAno;
    double anoAtual = 2024;
    double anosPassadosDesdeAPublicacao;

    public void recebeInformacaoECalcula(){

        System.out.println("Entre com o titulo do livro ");
        titulo = ler.nextLine();
        System.out.println("Entre com o autor do livro: ");
        autor = ler.nextLine();
        System.out.println("Entre com a quantidade de paginas: ");
        paginas = ler.nextDouble();
        System.out.println("Entre com o ano de publicação: ");
        anoPublicacao = ler.nextDouble();

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Ano de publicação: " + anoPublicacao);
        anosPassadosDesdeAPublicacao = anoAtual - anoPublicacao;
        paginasPorAno = paginas / anosPassadosDesdeAPublicacao;
        System.out.println("Paginas por ano: " + paginasPorAno);

    }
}
