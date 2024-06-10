package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
//Mostre na tela todas as cores que foram adicionadas. 
//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.


public class exerciciocollection {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		String auxiliar;
		
		ArrayList<String> cores= new ArrayList<String>();
		
		for(int contador=0;contador<5; contador++) {
			
			System.out.println("Informe 5 cores: ");
			auxiliar= leia.nextLine();
			cores.add(auxiliar);
			
		}
		
		System.out.println("\nCores cadastradas: " + cores);
		
		Collections.sort(cores);
		System.out.println("\nCores cadastradas em ordem crescente: " + cores);
		
		leia.close();
		

	}

}
