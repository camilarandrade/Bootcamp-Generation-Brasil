package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticao2 {

	public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
        
        int Menor21 = 0;
        int Maior50 = 0;
        int idade;
        int contador = 0;
        
        while (contador <= 10) {
        System.out.printf("Digite uma idade:\n", contador++);
        idade = leia.nextInt();
            
        if (idade < 0) {
                System.out.println("Idade inválida!");
                break;
            }
            
        if (idade < 21) {
                Menor21++;
            } else if (idade > 50) {
                Maior50++;
            }
        }
        
        System.out.println("\nTotal de pessoas menores de 21 anos: " + Menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + Maior50);
        
        leia.close();
    }
}