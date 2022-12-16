package exercicios03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (em reais): ");
		int real = sc.nextInt();
		System.out.println("Digite a cotação atual do real: ");
		int cot = sc.nextInt();

		int result = real / cot;

		System.out.println("O valor da conversão em dolares é: " + result);
		sc.close();
	}
}
//Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
//O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário, para que seja apresentado o valor em moeda americana.