package lacoscondicionais;

import java.util.Scanner;

public class exercicioslacoscondicionais2 {

    public static void main(String[] args) {
        
        float saldo = 1000.0f; 
        
        Scanner leia = new Scanner(System.in); 
        
        System.out.println("Digite: (1- Saldo, 2- Saque, 3- Depósito)");
        int operacao = leia.nextInt(); 
        
        switch (operacao) {
            case 1:
                
                System.out.printf("Saldo: R$"+ saldo); 
                break;
            
            case 2: 
                System.out.print("Saque \nValor: R$ ");
                float valorSaque = leia.nextFloat(); 
                
                if (valorSaque > saldo) { 
                    System.out.println("\n Saque: Saldo Insuficiente!");
                } else {
                    saldo -= valorSaque; 
                    System.out.println("Saque");
                    System.out.printf("Novo Saldo: "+ saldo); 
                }
                break;
                
            case 3: 
                System.out.print("Depósito: \nValor: R$ ");
                float valorDeposito = leia.nextFloat(); 

                saldo += valorDeposito; 
                System.out.println("Depósito");
                System.out.printf("Novo Saldo: "+ saldo);
                break;

            default: 
                System.out.println("Opção Inválida!");
                break;
        }
        
        leia.close(); 
    }
}
