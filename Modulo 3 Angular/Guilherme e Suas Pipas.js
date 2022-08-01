/*
Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos. Ele tem percebido que para as pipas possuírem maior estabilidade, e dessa forma voarem mais alto, elas devem possuir um barbante bem esticado ligando todos os pares de pontas não vizinhas.

Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe como determinar a quantidade de barbantes que ele terá que utilizar para tornar uma pipa de n lados, estável. Você pode ajudá-lo?.

Entrada
A entrada será composta por uma única linha, que contém um inteiro 3 ≤ n ≤ 105, representando o número de lados da pipa.

Saída
Imprima um número inteiro, que será a quantidade de barbantes que Guilherme terá que utilizar para tornar a pipa de n lados estável.

 
Exemplos de Entrada	Exemplos de Saída
4	  |  2
10	| 35
11	| 44
 
Homenagem ao meu irmão Guilherme, ele adora pipas.
Tapioca's Round I, 2015
*/

// A função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
let lines = gets().split("\n");

let N = parseInt(lines.shift());
//TODO: Complete os espaços em branco com uma possível solução para o desafio
let resposta = (N* (N -3)   ) / 2; 
print(   resposta     );