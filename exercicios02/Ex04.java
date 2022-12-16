package exercicios02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica do carro: ");
		float custoF = sc.nextFloat();
		float percentualD = custoF*(28/100);
		float percentualIM = custoF*(45/100);
		int custoC = (int) (custoF+percentualD+percentualIM);
		System.out.println("O custo do comsumidor é: "+custoC);
		sc.close();
	}
}


// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.