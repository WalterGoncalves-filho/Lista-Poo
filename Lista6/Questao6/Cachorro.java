package Lista6.Questao6;

public class Cachorro extends Animal {
    
    
    public Cachorro(String nome){
        super(nome);
    }
    
    @Override
    public void fazerSom() {
        System.out.println("Cachorro: Au Au!");
    }

}
