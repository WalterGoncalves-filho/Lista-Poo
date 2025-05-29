package Lista6.Questao10;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
