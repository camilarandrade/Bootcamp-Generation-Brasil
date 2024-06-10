package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class exerciciocollection2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		String auxiliar;
		
		Set<String> setValores = new HashSet<String>();
		System.out.println("Informe 10 números: ");
		
		for(int contador=0;contador<10;contador++) {
			auxiliar= leia.nextLine();
			setValores.add(auxiliar);
		
		}
		System.out.println("\nDados da Collection: " + setValores);
		
		System.out.println("\nValores cadastrados - Interface Iterator");

		Iterator<String> iValores = setValores.iterator();
		
		while(iValores.hasNext()) {
			System.out.println(iValores.next());
		}
		
		leia.close();
	}

}
