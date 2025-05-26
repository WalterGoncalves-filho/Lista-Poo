package Lista1.Questao_2;

public class Main {
    public static void main(String args[]){
        Pessoa waltin = new Pessoa();
        setarValores(waltin);
        mostrarValores(waltin);
    }

    public static void setarValores(Pessoa objPessoa){
        objPessoa.setNome("Walter filho");
        objPessoa.setIdade(18);
        objPessoa.setAltura(1.72f);
        objPessoa.setPeso(56.4f);
    }

    public static void mostrarValores(Pessoa objPessoa){
        System.out.print("\n\n");
        System.out.println("Classe Pessoa: ");
        System.out.println("----------------");
        System.out.println("Nome: " + objPessoa.getNome());
        System.out.println("Idade: " + objPessoa.getIdade());
        System.out.println("Altura: " + objPessoa.getAltura());
        System.out.println("Peso: " + objPessoa.getPeso());
        objPessoa.andar();
        objPessoa.pular();
        System.out.println("----------------");
    }
}
