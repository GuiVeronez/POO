package Exercicios.exer03POO;

public class Main {

    public static void main(String[] args) {

        Musica perguntaFichaTecnica  = new Musica();
        perguntaFichaTecnica.lerDadosEImprimeDados();

        System.out.println("\n");

        double media;
        Musica perguntaAvaliacao = new Musica();
        media = perguntaAvaliacao.avaliacao();
        System.out.println("Media: " + media);
    }
}
