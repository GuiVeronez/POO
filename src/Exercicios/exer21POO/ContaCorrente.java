package Exercicios.exer21POO;

public class ContaCorrente {

    long saldo;
    String titular;
    long limite;
    long saque;

    public void sacar () {
        if (saque <= saldo && saque <= limite) {
            System.out.println("Saque concluido!");
        } else {
            System.out.println("Não foi possivel efetuar o saque.");
        }
    }
}