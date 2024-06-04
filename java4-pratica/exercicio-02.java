package OperadoresLogicos;

import java.util.Scanner;

public class operadoreslogicos2 {

public static void main(String[] args) {

Scanner teclado= new Scanner(System.in);

float nota1, nota2, nota3, nota4; 

System.out.println ("Digite a sua primeira nota ");
nota1= teclado.nextFloat();

System.out.println ("Digite a sua segunda nota ");
nota2= teclado.nextFloat();

System.out.println ("Digite a sua terceira nota ");
nota3= teclado.nextFloat();

System.out.println ("Digite a sua quarta nota ");
nota4= teclado.nextFloat();

float media= (float) (nota1+nota2+nota3+nota4)/4;

System.out.println ("Portanto, a sua média é " + media);

teclado.close();

}

}
