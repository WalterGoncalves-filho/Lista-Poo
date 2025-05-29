package Lista6.Questao6;

public class Vaca extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Vaca: Muu!");
    }

    public Vaca(String nome){
        super(nome);
    }
    
}