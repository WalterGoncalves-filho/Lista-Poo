package Lista3.Questao_6;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, int numero, double limiteChequeEspecial) {
        super(titular, numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nDados conta corrente: ");
        System.out.println("\n----------------");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite do Cheque Especial: R$" + limiteChequeEspecial);
    }
}

