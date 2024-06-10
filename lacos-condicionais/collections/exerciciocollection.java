package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exerciciocollection {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		String auxiliar;
		
		ArrayList<String> cores= new ArrayList<String>();
		
		System.out.println("Informe 5 cores: ");
		for(int contador=0;contador<5; contador++) {
			
			auxiliar= leia.nextLine();
			cores.add(auxiliar);
			
		}
		
		System.out.println("\nCores cadastradas: " + cores);
		
		Collections.sort(cores);
		System.out.println("\nCores cadastradas em ordem crescente: " + cores);
		
		leia.close();
		

	}

}
