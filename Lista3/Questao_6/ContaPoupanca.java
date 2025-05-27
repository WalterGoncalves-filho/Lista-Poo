package Lista3.Questao_6;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros; // em porcentagem

    public ContaPoupanca(String titular, int numero, double taxaJuros) {
        super(titular, numero);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * (taxaJuros / 100);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nDados conta poupanca: ");
        System.out.println("\n----------------");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
    }
}
