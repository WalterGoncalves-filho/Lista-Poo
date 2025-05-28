package Lista4.Questao1;
import java.util.ArrayList;
import java.util.Scanner;

public class LojaTechGadgets {

    static ArrayList<Dispositivos> smartphone = new ArrayList<>();
    static ArrayList<Dispositivos> notbook = new ArrayList<>();
    static ArrayList<Dispositivos> smartwatch = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        do{
            System.out.println("\nDigite o código da opção do prosuto que vc deseja\ncadastrar no sistema: ");
            System.out.println("1- Aparelho Celular");
            System.out.println("2- NotBook");
            System.out.println("3- Relógio");
            System.out.println("4- Mostrar Dispositivos");
            System.out.println("0- Sair\n\n");
            System.out.print(">> ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    cadastrarSmartphone();
                    break;
                 case 2:
                    cadastrarNoteBook();
                    break;
                case 3:
                    cadastrarSmartwatch();
                    break;
                case 4: 
                    System.out.println("Para Qual Produto? ");
                    System.out.println("1- Aparelho Celular");
                    System.out.println("2- NotBook");
                    System.out.println("3- Relógio\n");
                    System.out.print(">> "); int cond = input.nextInt();
                    if (cond==1){
                        for(Dispositivos i : smartphone){
                            i.exibirInfo();
                        }
                    }else if(cond==2){
                        for(Dispositivos i: notbook){
                            i.exibirInfo();
                        }
                    }else{
                        for(Dispositivos i : smartwatch){
                            i.exibirInfo();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default: System.out.println("Dado invalido! Tente Novamente!");
                    break;
            }

        }while(op!=0);
    }
    
    public static void cadastrarSmartphone(){

        System.out.print("Digite o nome do Smartphone: "); 
        String nome = input.nextLine(); input.next();

        System.out.print("Digite o nome da marca: "); 
        String marca = input.nextLine(); input.next();

        System.out.print("Digite o nome do modelo: ");
        String modelo = input.nextLine(); input.next();

        System.out.print("Digite o nome do País de origem: ");
        String pais_origem= input.nextLine(); input.next();

        System.out.print("Digite o Preco do aparelho celular: "); 
        float preco = input.nextFloat();

        System.out.print("Digite o codigo do aparelho: "); 
        int cod = input.nextInt();

        System.out.print("Digite a capacidade de memoria ROM: "); 
        int memoria = input.nextInt();

        smartphone.add(new Smartphone(nome, modelo, marca, pais_origem, preco, cod));

    }

    public static void cadastrarNoteBook(){

        System.out.print("Digite o nome do NoteBook: "); 
        String nome = input.nextLine(); input.next();

        System.out.print("Digite o nome da marca: "); 
        String marca = input.nextLine(); input.next();

        System.out.print("Digite o nome do modelo: ");
        String modelo = input.nextLine(); input.next();

        System.out.print("Digite o nome do País de origem: ");
        String pais_origem= input.nextLine(); input.next();

        System.out.print("Digite o Preco do aparelho: "); 
        float preco = input.nextFloat();
       
        System.out.print("Digite o codigo do aparelho: "); 
        int cod = input.nextInt();
    
        System.out.print("Digite a capacidade de memoria RAM: "); 
        int memoria = input.nextInt();
     
        System.out.print("Digite o nome do seu processador: "); 
        String porcessador = input.next();input.next();

        notbook.add(new Notebook(nome, modelo, marca, pais_origem, preco, cod, memoria, porcessador));

    }

    public static void  cadastrarSmartwatch(){
        System.out.print("Digite o nome do Smartphone: "); 
        String nome = input.nextLine(); input.next();

        System.out.print("Digite o nome da marca: "); 
        String marca = input.nextLine(); input.next();

        System.out.print("Digite o nome do modelo: ");
        String modelo = input.nextLine(); input.next();

        System.out.print("Digite o nome do País de origem: ");
        String pais_origem= input.nextLine(); input.next();

        System.out.print("Digite o Preco do aparelho celular: "); float preco = input.nextFloat();

        System.out.print("Digite o codigo do aparelho: "); int cod = input.nextInt();

        System.out.print("Possui monitoramento Cardiaco (Y/N)? "); String resp = input.nextLine();input.next();
        
        boolean condCardio = false;
        
        if(resp == "y" || resp=="Y"){
           condCardio = true;        
        }
        else if (resp == "n" || resp=="n"){
            condCardio = false;
        }
        
        System.out.print("Possui GPS integrado (Y/N)? "); String booGPS = input.next();input.next();
        boolean condGPS = false;
        if(booGPS == "y" || booGPS=="Y"){
            condGPS = true;        
        }
        else if (booGPS == "n" || booGPS=="n"){
            condGPS = false;
        }

        smartwatch.add(new Smartwatch(nome, marca, modelo, pais_origem, preco, cod, condCardio, condGPS));
    }

}
