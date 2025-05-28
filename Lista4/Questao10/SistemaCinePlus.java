package Lista4.Questao10;

import java.util.ArrayList;

public class SistemaCinePlus {
    public static void main(String[] args) {
        ArrayList<PlanoAssinatura> assinaturas = new ArrayList<>();

        assinaturas.add(new PlanoBasico("João"));
        assinaturas.add(new PlanoFamilia("Maria"));
        assinaturas.add(new PlanoPremium("Carlos"));

        System.out.println("\n\n=== Assinaturas CinePlus ===\n");
        for (PlanoAssinatura plano : assinaturas) {
            System.out.println("Usuário: " + plano.getNomeUsuario());
            System.out.println("Plano: R$ " + plano.getPrecoMensal());
            System.out.println("Benefícios: " + plano.getBeneficios());
            System.out.println("\n-------------------------------");
        }
    }
}
