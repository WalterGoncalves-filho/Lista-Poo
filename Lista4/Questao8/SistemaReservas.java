package Lista4.Questao8;

import java.util.ArrayList;

public class SistemaReservas {
    public static void main(String[] args) {
        ArrayList<PacoteViagem> reservas = new ArrayList<>();

        reservas.add(new PacoteEconomico("João", "Rio de Janeiro"));
        reservas.add(new PacoteTuristico("Maria", "Foz do Iguaçu"));
        reservas.add(new PacoteLuxo("Carlos", "Fernando de Noronha"));

        for (PacoteViagem pacote : reservas) {
            System.out.println("\n\n----------------------------");
            System.out.println("Cliente: " + pacote.getCliente());
            System.out.println("Destino: " + pacote.getDestino());
            System.out.println("Preço: R$ " + pacote.getPreco());
            System.out.println("Descrição: " + pacote.getDescricao());
            System.out.println("----------------------------");
        }
    }
}

