package Lista6.Questao7;

public class ManipuladorDeTexto {

    public String inverterTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public int contarCaracteres(String texto) {
        return texto.length();
    }
}

