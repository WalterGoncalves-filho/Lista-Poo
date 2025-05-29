package Lista6.Questao10;

public abstract class ItemBiblioteca {
    private String titulo;
    private boolean emprestado;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Item emprestado: " + titulo);
        } else {
            System.out.println("Item já está emprestado: " + titulo);
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Item devolvido: " + titulo);
        } else {
            System.out.println("Item não estava emprestado: " + titulo);
        }
    }

    public abstract String getTipo();
}
