package Lista6.Questao9;

public class Subtracao extends Operacao {
    public double calcular(double a, double b) {
        return a - b;
    }

    @Override
    public String getNome() {
        return "Subtração";
    }
    
}
