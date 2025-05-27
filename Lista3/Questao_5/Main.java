package Lista3.Questao_5;

public class Main {
    public static void main(String args[]){
        Aluno al1 = new Aluno("walter", "01232", "Zumbi dos Palmares, N 52", "sistemas", "2411989");
        Professor prof1 = new Professor(
            "Paulo", "01232", "Zumbi dos Palmares, N 52", "Poo", "T.i", 1324.3f);

        al1.exibirDados();
        prof1.exibirDados();
    }
}
