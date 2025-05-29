package Lista5.Questao10;
import java.util.ArrayList;

public class Evento {
    private ArrayList<Participante> participantes;

    public Evento() {
        participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante p) {
        participantes.add(p);
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Nenhum participante registrado.");
        } else {
            System.out.println("Lista de Participantes:");
            for (int i = 0; i < participantes.size(); i++) {
                System.out.println("\nParticipante " + (i+1) + ": ");
                System.out.println(participantes.get(i));
                System.out.println("------------------");
            }
        }
    }
}
