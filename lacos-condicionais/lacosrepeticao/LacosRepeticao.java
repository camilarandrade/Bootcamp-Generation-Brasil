package LacosRepeticao;
import java.util.Scanner;


public class LacosRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numerosPares= 0;
		int numerosImpares= 0;
		
		//repete e lê os numeros digitados por 10 vezes
		
		for (int contador=1; contador<=10; contador++){
		System.out.printf ("Digite um número de 1 a 10\nNúmero "+ contador+": ");
		int numero= leia.nextInt();
		
		
		
		//verifica se os 10 numeros digitados são pares ou ímpares
		
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
