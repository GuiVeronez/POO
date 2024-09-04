package Exercicios.exer03;

import java.util.Scanner;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double numAvaliacoes;
    double mediaAvaliacoes;

    public void lerDadosEImprimeDados(){
        Scanner ler =  new Scanner(System.in);
        System.out.println("Digite o titulo da musica: ");
        titulo = ler.nextLine();
        System.out.println("Digite o artista da musica: ");
        artista = ler.nextLine();
        System.out.println("Digite o ano de lançamento da musica: ");
        anoLancamento = ler.nextInt();

        System.out.println("\n");

        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public double avaliacao() {
        Scanner ler = new Scanner(System.in);

        double contagem = 0;
        double avaliacao01 = 0;

        System.out.println("Digite o numero de avaliações: ");
        numAvaliacoes = ler.nextDouble();

        while (contagem < numAvaliacoes) {
            System.out.println("Entre com a avaliação: ");
            avaliacao = ler.nextDouble();
            avaliacao01 += avaliacao;
            contagem++;
        }
        mediaAvaliacoes = avaliacao01 / numAvaliacoes;
        return mediaAvaliacoes;
    }
}
