package lacosrepeticao;
import java.util.Scanner;

// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número
// são ímpares. 

public class lacosrepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numerosPares= 0;
		int numerosImpares= 0;
		
		//repete e lê os numeros digitados por 10 vezes
		for (int contador=0; contador<10; contador++){
		System.out.printf ("Digite o %dº número: ", contador+1); //contador+1 para não iniciar no 0 e sim no 1
		int numero= leia.nextInt();
		
		if(numero%2==0) {
			numerosPares++;
		} else {
			numerosImpares++;
		}
		
		}
		
		System.out.printf ("Números Pares: " + numerosPares + "\nNúmeros Ímpares: " + numerosImpares);
		leia.close();

	}

}
