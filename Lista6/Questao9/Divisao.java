package Lista6.Questao9;


public class Divisao extends Operacao {
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }

    @Override
    public String getNome(){
        return "Divisao";
    }
}