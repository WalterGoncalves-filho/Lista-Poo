package Lista4.Questao4;

public class ClinicaSaudeTotal {

    public static void main(String[] args) {
        Paciente paciente1 = new PacienteComum("Carlos", "074", 54);
        Paciente paciente2 = new PacienteVIP("nome", "cpf",18);
        Paciente paciente3 = new PacienteConvenio("José Souza", "555.666.777-88", 50, "Unimed");

        System.out.println("\n\n--- Paciente Comum ---");
        paciente1.exibirInfo();
        paciente1.agendarConsulta();

        System.out.println("\n--- Paciente VIP ---");
        paciente2.exibirInfo();
        paciente2.agendarConsulta();

        System.out.println("\n--- Paciente de Convênio ---");
        paciente3.exibirInfo();
        paciente3.agendarConsulta();
    }

}


