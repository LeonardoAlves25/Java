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
		System.out.println("O custo do comsumidor �: "+custoC);
		sc.close();
	}
}


// O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro, calcular e escrever o custo final ao consumidor.