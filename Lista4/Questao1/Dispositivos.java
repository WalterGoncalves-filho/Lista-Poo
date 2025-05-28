package Lista4.Questao1;

public abstract class Dispositivos {
    
    protected String nome;
    protected String modelo; 
    protected String marca; 
    protected String paisOrigem;
    protected float preco; 
    protected int cod;


    public Dispositivos(){}
    public Dispositivos(String nome, String modelo, String marca, String paisOrigem, float preco, int cod) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.paisOrigem = paisOrigem;
        this.preco = preco;
        this.cod = cod;
    }
    
    public abstract void exibirInfo();

    public String getNome() { return nome; }
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public String getPaisOrigem() { return paisOrigem; }
    public float getPreco() { return preco; }
    public int getCod() { return cod; }
    
    public void setNome(String nome) {this.nome = nome;}
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setPaisOrigem(String paisOrigem) { this.paisOrigem = paisOrigem; }
    public void setPreco(float preco) {this.preco = preco; }
    public void setCod(int cod) { this.cod = cod;}    
}
