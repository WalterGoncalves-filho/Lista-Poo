// Classe principal para testar o sistema

package Lista4.Questao1;

public class LojaTechGadgets {
    public static void main(String[] args) {
        Produto smartphone = new Smartphone("Galaxy S21", 3500.00, "Samsung", 128, true);
        Produto notebook = new Notebook("MacBook Air", 8500.00, "Apple", 8, "M1");
        Produto smartwatch = new Smartwatch("Apple Watch", 2500.00, "Apple", true, true);

        smartphone.exibirDetalhes();
        notebook.exibirDetalhes();
        smartwatch.exibirDetalhes();
    }
}
