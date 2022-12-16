package exercicios03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário mensal: ");
		float SM = sc.nextFloat();
		
		System.out.println("Digite o percentual do seu reajuste: ");
		float PR = sc.nextFloat();
		
		float NS = (SM*PR)+SM; 
		
		System.out.println("O valor do seu salário total é: "+NS);
		sc.close();
	}
}
//Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído.
//Apresentar o valor do novo salário (variável NS).