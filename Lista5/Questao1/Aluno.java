package Lista5.Questao1;

public class Aluno {
    private String nome;
    private double[] notas;
    private int totalNotas;

    public Aluno(String nome, int quantidadeNotas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
        this.totalNotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionarNota(double nota) {
        if (totalNotas < notas.length) {
            notas[totalNotas] = nota;
            totalNotas++;
            return true;
        } else {
            return false; // Não há espaço para mais notas
        }
    }

    public double calcularMedia() {
        if (totalNotas == 0) return 0.0;

        double soma = 0;
        for (int i = 0; i < totalNotas; i++) {
            soma += notas[i];
        }
        return soma / totalNotas;
    }

    public void exibirNotas() {
        System.out.print("Notas de " + nome + ": ");
        for (int i = 0; i < totalNotas; i++) {
            System.out.printf("%.3f ", notas[i]);
        }
        System.out.println();
    }
}
