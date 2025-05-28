package Lista4.Questao3;

public class EscolaFuturoBrilhante {
    public static void main(String[] args) {
        CursoRegular cursoRegular = new CursoRegular("Matemática", 12, 500);
        CursoTecnico cursoTecnico = new CursoTecnico("Técnico em Informática", 18, 700);
        CursoProfissionalizante cursoProf = new CursoProfissionalizante("Cabeleireiro Profissional", 6, 400);

        System.out.println("--- Curso Regular ---");
        cursoRegular.exibirInfo();

        System.out.println("\n--- Curso Técnico ---");
        cursoTecnico.exibirInfo();

        System.out.println("\n--- Curso Profissionalizante ---");
        cursoProf.exibirInfo();
        cursoProf.beneficioExtra();
    }
}
