package lacosrepeticao;
import java.util.Scanner;

public class lacosrepeticao2 {

        // Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

	public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
        
        int idade= 1, menor21=0, maior50=0;
        
        //enquanto a idade for maior que 0, repetirá digite uma idade
        
        while (idade > 0) {
        System.out.printf("Digite uma idade ou 0 pra finalizar:\n");
        idade = leia.nextInt();
            
        if (idade > 0 && idade < 21) {
                menor21++; 
            
        } else if (idade > 50) {
                maior50++;
        
        }
        }
        
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
        
        leia.close();
    }
}