package Lista2.Questao_2;

public class Main {
    public static void main(String args[]){
        System.out.println("Números de 0 a 100");
        for (int i = 1;i<=100;i++){
            if(i%2==0)
                System.out.println("par --> " +i);
            else{
                System.out.println("impar --> " +i);
            }
        }
    }
}
