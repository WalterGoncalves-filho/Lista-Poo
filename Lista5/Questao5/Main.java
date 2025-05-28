package Lista5.Questao5;

public class Main {
    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();

        System.out.println("\n");
        conta.depositar(1500.00);
        conta.sacar(300.00);
        conta.sacar(1500.00);
        conta.depositar(-100); 
        conta.exibirExtrato();
    }
}
