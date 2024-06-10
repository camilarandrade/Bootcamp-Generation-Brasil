package lacoscondicionais;

import java.util.Scanner;

    public class exercicioslacoscondicionais {
	public static void main (String[]args) {
		
	 Scanner leia= new Scanner (System.in);
	 
	 int a, b, c; 
	 
	   System.out.println ("Digite o primeiro valor: ");
		a= leia.nextInt();
		
		System.out.println ("Digite o segundo valor: ");
		b= leia.nextInt();
		
		System.out.println ("Digite o terceiro valor: ");
		c= leia.nextInt();
		
		leia.close();
		
		int soma= a+b; 
		
		if(soma>c) {
			System.out.println ("A soma de " + a + " + " + b + " é Maior do que " + c
			+ "\nSoma: " + soma);
			
		} else if(soma<c) {
			System.out.println ("A soma de " + a + " + " + b +" é Menor do que " + c
		    + "\nSoma: " + soma);
		} else {
			
			System.out.println ("A soma de " + a + " + " + b +" é igual a " + c);
		}
		
		
	}

}
