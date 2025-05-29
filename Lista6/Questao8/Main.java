package Lista6.Questao8;

public class Main {
    public static void main(String[] args) {
        ConexaoBanco conexao1 = ConexaoBanco.getInstancia();
        ConexaoBanco conexao2 = ConexaoBanco.getInstancia();

        if (conexao1 == conexao2) {
            System.out.println("Mesma instância de conexão reutilizada!");
        } else {
            System.out.println("Instâncias diferentes (algo está errado!)");
        }
    }
}

