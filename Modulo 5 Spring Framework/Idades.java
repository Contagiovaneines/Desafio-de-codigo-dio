/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.

 
Exemplo de Entrada |	Exemplo de Saída
34 | 39.25
56
44
23
-2



Agradecimentos a Cassio F.
*/
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double soma = 0;
        int n = leitor.nextInt();
        
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        
        while (n >= 1){
            if (n >= 0) {
                soma+=n ;
                cont++;
            }
            n = leitor.nextInt();
        }
        double media =      soma/cont   ;
        System.out.println(String.format("%.2f",  media   ));
    }
}