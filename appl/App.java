//CÓDIGO PRINCIPAL 
//////////////////classes importadas
package appl;
import java.util.Scanner;
import java.util.Random;


//////////////////classe principal
public class App{
      
      public static String nome1;
        public static String nome2;
        public static int numero=0;
        public static int numero2=0;
       
        
    public static void main(String[] args) {
        System.out.println("Jogador 1: digite seu nome: ");
        Scanner scani = new Scanner(System.in);
        nome1 = scani.nextLine();

        System.out.println("Jogador 2: digite seu nome: ");
        Scanner scan2 = new Scanner(System.in);
        nome2 = scan2.nextLine();
        
        
//////////////////////////////////////////////PEDRA PAPEL E TESOURA 
////PedraPapelTesoura partida = new PedraPapelTesoura(); instancia a classe auxiliar´PedraPapelTesoura
////partida.jogar(numero, numero2, nome1, nome2); chama o método jogar, definido na classe auxiliar pedra papel e tesoura
PedraPapelTesoura partida = new PedraPapelTesoura();
partida.jogar(numero, numero2, nome1, nome2);



//armamento revolver = new armamento(); instancia a classe auxiliar armamento
//revolver.arma();chama o método revolver definido na classe auxiliar armamento
armamento revolver = new armamento();
revolver.arma();
    
  
    
    }

    
   
    
}