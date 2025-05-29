package Lista6.Questao6;

public class Gato extends Animal{
   
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Gato: Miau!");
    }
}