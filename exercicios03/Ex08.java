package exercicios03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu sal�rio mensal: ");
		float SM = sc.nextFloat();
		
		System.out.println("Digite o percentual do seu reajuste: ");
		float PR = sc.nextFloat();
		
		float NS = (SM*PR)+SM; 
		
		System.out.println("O valor do seu sal�rio total �: "+NS);
		sc.close();
	}
}
//Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o valor do percentual de reajuste (vari�vel PR) a ser atribu�do.
//Apresentar o valor do novo sal�rio (vari�vel NS).