package Lista5.Questao10;

public class Participante {
    private String nome;
    private String tipo_ingresso;
    private int idade;

    public Participante(String nome, String tipo_ingresso, int idade) {
        this.nome = nome;
        this.tipo_ingresso = tipo_ingresso;
        this.idade = idade;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo_ingresso() { return tipo_ingresso;}
    public void setTipo_ingresso(String tipo_ingresso) { this.tipo_ingresso = tipo_ingresso;}
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade;}

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nIngresso: " + tipo_ingresso;
    }
}
