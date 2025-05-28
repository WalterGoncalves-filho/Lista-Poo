package Lista4.Questao4;

public class PacienteComum extends PacienteVIP {

    public PacienteComum(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Consulta agendada para paciente comum " + getNome() + ".");
        System.out.println("Valor da consulta: R$ 200,00.");
    }
}

