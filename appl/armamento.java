/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//sistema importou para cá por algum motivo!?
//A importação de membros estáticos em Java é uma funcionalidade introduzida no Java 5. 
//Ela permite que você acesse membros estáticos (variáveis e métodos) 
//de uma classe sem precisar qualificar 
//o nome da classe a cada vez que você os usa
package appl;
import static appl.App.nome1;
import static appl.App.nome2;
import static appl.App.numero;
import static appl.App.numero2;
import java.util.Random;

///Classe usada para fazermos a arma que dispara
// A HERANÇA TÃO BUSCADA ERA SÓ O EXTENDS
public class armamento extends PedraPapelTesoura{

public static void arma (){
    
   
    Random random = new Random();
    
    int i = 0;
    int n5 = random.nextInt(5);
//    System.out.println(n5);
    

while(i!=5){
    System.out.println("a arma não disparou, joguem novamente!");
while(i!=n5){
//    PedraPapelTesoura partida = new PedraPapelTesoura();
//   partida.jogar(numero, numero2, nome1, nome2);

// o TAL DO POLIMORFISMO QUE NÓS PRECISAVA TÁ AQUI
armamento armamento = new armamento();
armamento.jogar(numero, numero2, nome1, nome2);  
i++;

   break;
}
break; }
}

//ESSE AQUI BELÍSSIMO COMO SEMPRE É O OBJETO COMO TANTOS OUTROS NESSE PROGRAMA!!!!
   public static void revolvers() {
        String disparo = "A Arma atirou, você Morreu!!!!!";
    System.out.println(disparo);
    
    }
}