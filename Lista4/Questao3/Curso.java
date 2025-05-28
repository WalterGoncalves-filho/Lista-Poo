package Lista4.Questao3;

public abstract class Curso {
    private String nome;
    private int duracao; 
    private double valorMensalidade;

    public Curso(String nome, int duracao, double valorMensalidade) {
        this.nome = nome;
        this.duracao = duracao;
        this.valorMensalidade = valorMensalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

   
    public abstract double calcularDesconto();

    public double valorComDesconto() {
        return valorMensalidade - calcularDesconto();
    }

    public void exibirInfo() {
        System.out.println("Curso: " + nome);
        System.out.println("Duração: " + duracao + " meses");
        System.out.println("Valor mensalidade: R$" + valorMensalidade);
        System.out.println("Valor com desconto: R$" + valorComDesconto());
    }
}
