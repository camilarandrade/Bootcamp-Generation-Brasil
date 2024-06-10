package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exerciciocollection3 {

	public static void main(String[] args) {
			Scanner leia= new Scanner(System.in);
			
			ArrayList<Integer> valores= new ArrayList<Integer>();
			
			
			//declarando variavel para armazenar os numeros a serem encontratos
			//index para armazenar a posição do número na lista
			
			int localizador, index= 0;
			boolean achouNumero= false; //declarando uma variável booleana para dizer se achou ou não o número, true or false
			
			// adicionando os numeros na arraylist
			valores.add(2);
			valores.add(5);
			valores.add(1);
			valores.add(3);
			valores.add(4);
			valores.add(9);
			valores.add(7);
			valores.add(8);
			valores.add(10);
			valores.add(6);
			
			//usuario digita o numero que deseja encontrar
			//armazena na variavel localizador o que foi digitado pelo usuario
			System.out.print("Digite um número e encontre a posição na lista: ");
			localizador= leia.nextInt();
			
			//laço de repetição para passar pelo arraylist e procurar o numero digitado pelo usuario
			//puxa os valores que estao na lista e verifica se é igual ao que foi digitado pelo usuario
			//caso passe pela lista e ache o numero, retorna true
			//armazena a posição do número encontrado na variável index
			for (int contador=0;contador<valores.size();contador++) {
				if (valores.get(contador)== localizador) {
					achouNumero=true;
					index=contador;
				}
			}
			
			if (achouNumero) {
				//%d é um especificador de formato usado para formatar números inteiros (d de decimal). 
				//Quando usado %d dentro de uma string no printf, ele será substituído pelo valor dos 
				//argumentos fornecidos após a string de formato, nesse caso, localizador e index
				
				System.out.printf("\nO número %d está localizado na posição %d", localizador, index);
			}  else {
				
				System.out.printf("\nO número %d não foi encontrado!", localizador);
			}
			leia.close();
	}

}
