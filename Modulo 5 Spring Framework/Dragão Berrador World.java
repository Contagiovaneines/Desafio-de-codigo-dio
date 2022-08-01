/*
Desafio
Todos os habitantes do Mundo Mágico estão super animados com a abertura do Dragão Berrador World, o mais novo parque de diversões do universo bruxo. 

Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo Ministério Bruxo. Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.

Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado pela gerência do Dragão Berrador World para fazer um programa que, dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso consiste em três inteiros N (1 ≤ N ≤ 100), Amin e Amax (50 ≤ Amin ≤ Amax ≤ 250), o número de visitantes, a altura mínima e máxima em centímetros para andar na montanha-russa, respectivamente.

As N linhas seguintes contém, cada uma, um número inteiro representando a altura do visitantes, em centímetros.

Saída
Para cada caso de teste, imprima uma única linha com o número visitantes que podem passear na montanha-russa.

 
Exemplo de Entrada	| Exemplo de Saída
8 160 182 |5
160
182
183
159
250
170
172
173

Exemplo de Entrada	| Exemplo de Saída
5 155 176 | 2
149
154
172
182
167
 

*/
 import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RollerCoaster {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int maxGuests = sc.nextInt();
		int heightMin = sc.nextInt();
		int heightMax = sc.nextInt();
    
		int enteredGuests = 0;
    
		List<Integer> guests = new ArrayList<Integer>();
    
		while(sc.hasNext()) {
			guests.add(sc.nextInt());
		}
		
		List<Integer> guestsAllowed = guests.stream()
										.filter(g -> g >= heightMin)
										.filter(g -> g <= heightMax)
										.collect(Collectors.toList());

		enteredGuests = (guestsAllowed.size() < maxGuests) ? guestsAllowed.size() : maxGuests;
    
		System.out.println(enteredGuests);
	
		sc.close();
	}
}