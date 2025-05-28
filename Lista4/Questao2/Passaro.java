package Lista4.Questao2;

public class Passaro extends Animal {
    private boolean gaiolaSuja;

    public Passaro(String nome, int idade, String raca, boolean gaiolaSuja) {
        super(nome, idade, raca);
        this.gaiolaSuja = gaiolaSuja;
    }

    public boolean isGaiolaSuja() {
        return gaiolaSuja;
    }

    public void setGaiolaSuja(boolean gaiolaSuja) {
        this.gaiolaSuja = gaiolaSuja;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu!");
    }

    public void limparGaiola() {
        if (gaiolaSuja) {
            System.out.println("A gaiola de " + getNome() + " está sendo limpa.");
            gaiolaSuja = false;
        } else {
            System.out.println("A gaiola de " + getNome() + " já está limpa.");
        }
    }
}
