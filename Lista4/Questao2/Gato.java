
package Lista4.Questao2;
public class Gato extends Animal {
    private boolean precisaApararUnhas;

    public Gato(String nome, int idade, String raca, boolean precisaApararUnhas) {
        super(nome, idade, raca);
        this.precisaApararUnhas = precisaApararUnhas;
    }

    public boolean isPrecisaApararUnhas() {
        return precisaApararUnhas;
    }

    public void setPrecisaApararUnhas(boolean precisaApararUnhas) {
        this.precisaApararUnhas = precisaApararUnhas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void apararUnhas() {
        if (precisaApararUnhas) {
            System.out.println(getNome() + " está tendo as unhas aparadas.");
            precisaApararUnhas = false;
        } else {
            System.out.println(getNome() + " não precisa aparar as unhas agora.");
        }
    }
}
