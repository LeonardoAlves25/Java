package exercicios03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (em dolar): ");
		int dol = sc.nextInt();
		System.out.println("Digite a cotação atual do dolar: ");
		int cot = sc.nextInt();

		int result = dol*cot;

		System.out.println("O valor da conversão em reais é: " + result);
		sc.close();
	}
}
//Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
//O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.