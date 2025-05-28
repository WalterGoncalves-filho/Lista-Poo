package Lista4.Questao9;

import java.util.ArrayList;

public class SistemaCardapio {
    public static void main(String[] args) {
        ArrayList<ItemCardapio> cardapio = new ArrayList<>();

        cardapio.add(new PratoALaCarte("Filé Mignon ao Molho Madeira", 79.90));
        cardapio.add(new ComboPromocional("Combo Burger + Refrigerante", 49.90));
        cardapio.add(new MenuDegustacao("Experiência Chef Sabor & Arte"));

        System.out.println("\n\n=== Cardápio Digital ===\n");
        for (ItemCardapio item : cardapio) {
            System.out.println("Item: " + item.getNome());
            System.out.println("Preço: R$ " + item.getPreco());
            System.out.println("Descrição: " + item.getDescricao());
            System.out.println("----------------------------");
        }
    }
}

