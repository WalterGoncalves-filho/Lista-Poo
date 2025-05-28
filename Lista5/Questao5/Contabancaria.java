package Lista5.Questao5;

import java.util.ArrayList;

public class Contabancaria {
    private double saldo;
    private ArrayList<String> historico;

    public Contabancaria() {
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add(String.format("Depósito: +R$ %.2f", valor));
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            historico.add(String.format("Saque: -R$ %.2f", valor));
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }

    public void exibirExtrato() {
        System.out.println("\n=== Extrato da Conta ===");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma movimentação.");
        } else {
            for (String mov : historico) {
                System.out.println(mov);
            }
        }
        System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
        System.out.println("========================\n");
    }

    public double getSaldo() {
        return saldo;
    }
}
