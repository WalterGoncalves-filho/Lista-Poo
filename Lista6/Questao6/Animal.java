package Lista6.Questao6;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public abstract void fazerSom();
}