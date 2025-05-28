package Lista4.Questao2;

public class PetShopFeliz {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", 4, "Labrador", true);
        Gato cat = new Gato("Mimi", 2, "Siamês", true);
        Passaro bird = new Passaro("Piu", 1, "Canário", true);

        // Exibir informações e emitir sons (polimorfismo)
        dog.exibirInfo();
        dog.emitirSom();
        dog.tosar();

        System.out.println();

        cat.exibirInfo();
        cat.emitirSom();
        cat.apararUnhas();

        System.out.println();

        bird.exibirInfo();
        bird.emitirSom();
        bird.limparGaiola();
    }
}
