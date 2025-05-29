package Lista6.Questao10;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    public void listarItens() {
        for (ItemBiblioteca item : itens) {
            String status = item.isEmprestado() ? "Emprestado" : "Disponível";
            System.out.println("[" + item.getTipo() + "] " + item.getTitulo() + " - " + status);
        }
    }

    public void emprestarItem(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                item.emprestar();
                return;
            }
        }
        System.out.println("Item não encontrado: " + titulo);
    }

    public void devolverItem(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                item.devolver();
                return;
            }
        }
        System.out.println("Item não encontrado: " + titulo);
    }
}

