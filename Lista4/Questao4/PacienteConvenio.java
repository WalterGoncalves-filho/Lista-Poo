package Lista4.Questao4;

public class PacienteConvenio extends Paciente {
    private String nomeConvenio;

    public paciente(){}
    public PacienteConvenio(String nome, String cpf, int idade, String nomeConvenio) {
        super(nome, cpf, idade);
        this.nomeConvenio = nomeConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Consulta agendada para paciente de convênio " + getNome() + ".");
        System.out.println("Convênio: " + nomeConvenio);
        System.out.println("Valor da consulta: R$ 50,00 (com desconto do convênio).");
        System.out.println("Verificar cobertura do convênio para exames adicionais.");
    }
}

