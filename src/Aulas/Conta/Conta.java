package Aulas.Conta;
public class Conta {

    private double saldo;
    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo = saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }
}
