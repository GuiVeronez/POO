package Aulas.Conta;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta();
//      c1.saldo = 300;
        c1.setSaldo(150);
        c1.sacar(100);
        System.out.println("Saldo = " + c1.getSaldo());

    }
}
