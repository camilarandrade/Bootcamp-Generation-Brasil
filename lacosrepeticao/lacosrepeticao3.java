package lacosrepeticao;
import java.util.Scanner;

public class lacosrepeticao3 {

    public static void main(String[] args) {
        
        // Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
        // Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. 
        
        int numeros, soma = 0;
        Scanner leia = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número ou  0 para sair: ");
            numeros = leia.nextInt();
            
            //se o número for maior que 0, adiciona o número a soma
            if (numeros > 0) {
                soma += numeros;
            }
        } while (numeros != 0); //continua enquanto o numero digitado for diferente de 0
        
        System.out.println("A soma dos números positivos é: " + soma); 
        
        leia.close();
    }
}
