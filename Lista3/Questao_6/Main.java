package Lista3.Questao_6;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Waltinho", 1234, 500.0);
        ContaPoupanca cp = new ContaPoupanca("camilla", 5678, 1.5);

        cc.depositar(1000);
        cc.sacar(1200);
        cc.exibirInformacoes();

        cp.depositar(2000);
        cp.aplicarJuros();
        cp.exibirInformacoes();
    }
}
