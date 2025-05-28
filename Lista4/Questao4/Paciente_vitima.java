package Lista4.Questao4;

public class PacienteVIP extends Paciente {

    public PacienteVIP(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Consulta agendada para paciente VIP " + getNome() + ".");
        System.out.println("Valor da consulta com desconto VIP (30%): R$ " + calcularValorComDesconto());
        System.out.println("Benefício: atendimento prioritário e sala VIP.");
    }

    private double calcularValorComDesconto() {
        double valorOriginal = 200.0;
        double desconto = valorOriginal * 0.30;
        return valorOriginal - desconto;
    }

    @Override
    public class void () {}
}

