programa {
    funcao inicio() {
        inteiro numeros[10]
        inteiro soma = 0
        real media

       
        para(inteiro i de 0 ate 9) {
            escreva("Digite o ", i + 1, "º número: ")
            leia(numeros[i])
            soma = soma + numeros[i]
        }

        escreva("\nElementos nos índices ímpares:\n")
        para(inteiro i de 1 ate 9 passo 2) {
            escreva(numeros[i], " ")
        }

        
        escreva("\n\nElementos pares:\n")
        para(inteiro i de 0 ate 9) {
            se(numeros[i] % 2 == 0) entao {
                escreva(numeros[i], " ")
            }
        }

      
        media = real(soma) / 10

        
        escreva("\n\nSoma: ", soma)
        escreva("\n\nMédia: ", media)
    }
}
