package Exercicios.exer14;

public class Aluno {

    private String nome;
    private double notas;
    private double notas1;
    public double media;

    public double getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        this.notas = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas1() {
        return notas1;
    }

    public void setNotas1(double notas1) {
        this.notas1 = notas1;
    }

    public void calcularMedia() {
        media = notas + notas1 / 2;
        System.out.println(media);
    }
}
