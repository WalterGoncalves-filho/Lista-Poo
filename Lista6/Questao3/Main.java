package Lista6.Questao3;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("=== Cálculo de Área e Perímetro ===");
        System.out.print("Digite a largura do retângulo: ");
        double largura = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a altura do retângulo: ");
        double altura = Double.parseDouble(scanner.nextLine());

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("\n" + retangulo);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
