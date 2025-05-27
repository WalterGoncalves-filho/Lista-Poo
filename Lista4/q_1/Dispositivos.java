package Lista4.q_1;

public abstract class Dispositivos {
    
    protected String nome;
    protected String modelo; 
    protected String marca; 
    protected String paisOrigem;
    protected float preco; 
    protected int cod;


    public String getNome() {
        return nome;
    }


    public String getModelo() {
        return modelo;
    }


    public String getMarca() {
        return marca;
    }


    public String getPaisOrigem() {
        return paisOrigem;
    }


    public float getPreco() {
        return preco;
    }


    public int getCod() {
        return cod;
    }


    public Dispositivos(String nome, String modelo, String marca, String paisOrigem, float preco, int cod) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.paisOrigem = paisOrigem;
        this.preco = preco;
        this.cod = cod;
    }


    public abstract void exibirInfo();
    
}
