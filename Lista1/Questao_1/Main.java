package Lista1.Questao_1;

public class Main {
    public static void main(String args[]){
        Animal animal = new Animal("Cachorro", 23.5f, 32.45f, 1);
        exibirDados(animal);
        animal.emitirSom();
    }

    public static void exibirDados(Animal ani){
        System.out.println("\n\n");
        System.out.println("Classe Animal:       ");
        System.out.println("----------------");
        System.out.println("Nome: " + ani.getNomepopular());
        System.out.println("Peso: " + ani.getPeso());
        System.out.println("Altura: " + ani.getAltura());
        System.out.println("Idade: " + ani.getIdade() + " ano.");
        System.out.println("----------------");
    }
}
