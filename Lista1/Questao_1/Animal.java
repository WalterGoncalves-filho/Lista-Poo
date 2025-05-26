package Lista1.Questao_1;

public class Animal{
    private String nomepopular;
    private float altura;
    private float peso;
    private int idade;


    public Animal(String nomepopular, float peso, float altura, int idade){
        this.nomepopular = nomepopular;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNomepopular() { return nomepopular; }
    public void setNomepopular(String nomepopular) { this.nomepopular = nomepopular; }
    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }
    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public void emitirSom(){
        System.out.println("Emitindo Som...\n");
    }

}