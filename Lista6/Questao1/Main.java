package Lista6.Questao1;
import java.util.ArrayList;

public class Main {
    static ArrayList<Participante> participantes = new ArrayList<>();
    public static void main(String[] args) {
        participantes.add(new Participante("Ana", 22, "VIP"));
        participantes.add(new Participante("Bruno", 30, "Pista"));
        participantes.add(new Participante("Carlos", 28, "Meia"));

        System.out.println("\n\n  Dados de Todos os Participantes:");

        for(Participante obj : participantes){
            System.out.println(obj);
            System.out.println("-----------------\n");
        }

        System.out.println("Total de participantes criados: " + Participante.getTotalCriados());
    }
}
