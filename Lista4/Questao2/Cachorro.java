package Lista4.Questao2;

public class Cachorro extends Animal {
    private boolean precisaTosar;

    public Cachorro(String nome, int idade, String raca, boolean precisaTosar) {
        super(nome, idade, raca);
        this.precisaTosar = precisaTosar;
    }

    public boolean isPrecisaTosar() {
        return precisaTosar;
    }

    public void setPrecisaTosar(boolean precisaTosar) {
        this.precisaTosar = precisaTosar;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    public void tosar() {
        if (precisaTosar) {
            System.out.println(getNome() + " está sendo tosado.");
            precisaTosar = false;
        } else {
            System.out.println(getNome() + " não precisa de tosa agora.");
        }
    }
}
