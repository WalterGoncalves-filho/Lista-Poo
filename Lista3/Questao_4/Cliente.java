package Lista3.Questao_4;

public class Cliente{
    private String nome;
    private String email;
    private String endereco;

    public Cliente(String nome, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pedido fazerPedido() {
        return new Pedido(this);
    }
    
    public void exibirDados(){
        System.out.println("\n\nDados do cliente: ");
        System.out.println("------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereco: " + getEndereco());        
        System.out.println("------------------------\n");
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + 
        "Email: " + email + "\n" +
        "Endereço: " + endereco;
    }
}