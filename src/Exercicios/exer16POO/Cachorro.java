package Exercicios.exer16POO;

public class Cachorro {

    String raca;
    String nome;
    int idade;

    public void latir () {
        System.out.println("Au Au!");
    }

    public void mostrarInformacoes () {
        System.out.println("Raça: " + raca);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
