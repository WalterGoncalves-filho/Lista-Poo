package Lista4.Questao4;

public class ClinicaSaudeTotal {

    public static void main(String[] args) {
        PacienteVIP paciente1 = new PacienteComum("Carlos Silva", "123.456.789-00", 40);
        PacienteVIP paciente2 = new PacienteVIP("Ana Maria", "987.654.321-00", 35);
        PacienteVIP paciente3 = new PacienteConvenio("José Souza", "555.666.777-88", 50, "Unimed");

        System.out.println("--- Paciente Comum ---");
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


