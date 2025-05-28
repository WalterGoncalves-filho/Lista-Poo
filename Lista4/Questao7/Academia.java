package Lista4.Questao7;
import java.util.ArrayList;


public class Academia {
    public static void main(String[] args) {
        ArrayList<PlanoTreino> clientes = new ArrayList<>();

        clientes.add(new PlanoBasico("João"));
        clientes.add(new PlanoIntermediario("Maria"));
        clientes.add(new PlanoPremium("Carlos"));

        for (PlanoTreino plano : clientes) {
            System.out.println("\n---------------");
            System.out.println("Cliente: " + plano.getNomeCliente());
            System.out.println("Plano: R$ " + plano.getPreco());
            System.out.println("Benefícios: " + plano.getBeneficios());
            System.out.println("---------------");
        }
    }
}