
package appl;

import java.util.Scanner;


public class PedraPapelTesoura {


    public static void jogar(int numero, int numero2, String nome1, String nome2){
      
             
do{
        System.out.println(nome1 + " escolha\n (1)pedra (2)papel (3)tesoura");
        Scanner sc = new Scanner(System.in);
         numero = sc.nextInt();

            switch (numero) {
                case 1: 
                    System.out.println("você escolheu pedra");
                    break;
                case 2: 
                    System.out.println("você escolheu papel");
                    break;
                case 3:
                    System.out.println("você escolheu tesoura");    
                    break;
                default:
                System.out.println(nome1 + " escolha apenas\n (1)pedra (2)papel (3)tesoura ");
                numero = sc.nextInt();
                break;
            }
        }while(numero>3 || numero<0);


do{
    System.out.println(nome2+ " escolha: \n (1)pedra(2)papel(3)tesoura");
    Scanner scan = new Scanner(System.in);
        numero2 = scan.nextInt();
        switch (numero2) {
            case 1: 
                System.out.println("você escolheu pedra");
                break;
        case 2: 
        System.out.println("você escolheu papel");
        break;
         case 3:
         System.out.println("você escolheu tesoura");    
         break;
        default:
        System.out.println(nome2+ " escolha apenas\n (1)pedra(2)papel(3)tesoura");
        numero2 = scan.nextInt();
                break;
        }
        
        
}while(numero2>3 || numero2<0);

        
        
             if (numero == 1 && numero2 == 1) {
        System.out.println("EMPATE");
    } else if (numero == 1 && numero2 == 2) {
        System.out.println(nome2 + " ganhou " + nome1 + ", " + nome1 + " pegue a arma e atire!");

    } else if (numero == 1 && numero2 == 3) {
        System.out.println(nome1 + " ganhou " + nome2 + ", " + nome2 + " pegue a arma e atire!");
    } else if (numero == 2 && numero2 == 1) {
        System.out.println(nome1 + " ganhou " + nome2 + ", " + nome2 + " pegue a arma e atire!");
    } else if (numero == 2 && numero2 == 2) {
        System.out.println("EMPATE");
    } else if (numero == 2 && numero2 == 3) {
        System.out.println(nome2 + " ganhou " + nome1 + ", " + nome1 + " pegue a arma e atire!");
    } else if (numero == 3 && numero2 == 1) {
        System.out.println(nome2 + " ganhou " + nome1 + ", " + nome1 + " pegue a arma e atire!");
    } else if (numero == 3 && numero2 == 2) {
        System.out.println(nome1 + " ganhou " + nome2 + ", " + nome2 + " pegue a arma e atire!");
    } else if (numero == 3 && numero2 == 3) {
        System.out.println("EMPATE");
    }

    
}
    
}