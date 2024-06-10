package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {

		// atribuindo valores e posições aos numeros no array

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		// scanner para ler o numero

		Scanner leia = new Scanner(System.in);

		// entrada do usuario

		System.out.println("Digite um número de 1 a 10 e veja a posição dentro da lista ");
		int numero = leia.nextInt();
		leia.close();

		// for para percorrer se o numero está no vetor
		//enquanto o valor de contator for menor que o valor da array, nos vamos continuar contando os laço

		//length é o comprimento 
		
		for (int indice = 0; indice < vetor.length; indice++) {

			// if para comparar o numero no indice com o digitado, se for igual exibir

			if (vetor[indice] == numero) {
				System.out.println("O número " + numero + " está localizado na posição " + indice++);
			}

		}

	}
}