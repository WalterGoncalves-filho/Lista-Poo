package Lista6.Questao6;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Spaker"));
        animais.add(new Gato("Mel"));
        animais.add(new Vaca("Batina"));

        System.out.println("\n\n=== Sons dos Animais ===");
        for (Animal animal : animais) {
            System.out.print(animal.getNome() + " faz: ");
            animal.fazerSom();
        }
    }
}
