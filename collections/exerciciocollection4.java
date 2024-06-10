package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class exerciciocollection4 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		
		Set<Integer> Valores = new HashSet<>();
		
		Valores.add(2);
		Valores.add(5);
		Valores.add(1);
		Valores.add(3);
		Valores.add(4);
		Valores.add(9);
		Valores.add(7);
		Valores.add(8);
		Valores.add(10);
	    Valores.add(6);
		
		System.out.print("Digite um número e veja se ele está na lista: ");
	    int localizador = leia.nextInt();
	    
	    if (Valores.contains(localizador)) {
			
			System.out.printf("\nO número %d foi encontrado!", localizador);
		}  else {
			
			System.out.printf("\nO número %d não foi encontrado!", localizador);
		}
	    
	    
	    Iterator<Integer> iValores = Valores.iterator();
        System.out.println("\nValores na lista:");
        while (iValores.hasNext()) {
            System.out.println(iValores.next());
        }
        
		leia.close();
	}
	
	
	

}
