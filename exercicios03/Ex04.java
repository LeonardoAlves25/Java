package exercicios03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (em dolar): ");
		int dol = sc.nextInt();
		System.out.println("Digite a cota��o atual do dolar: ");
		int cot = sc.nextInt();

		int result = dol*cot;

		System.out.println("O valor da convers�o em reais �: " + result);
		sc.close();
	}
}
//Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em d�lar.
//O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�vel com o usu�rio, para que seja apresentado o valor em moeda brasileira.