package exercicios03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (em reais): ");
		int real = sc.nextInt();
		System.out.println("Digite a cota��o atual do real: ");
		int cot = sc.nextInt();

		int result = real / cot;

		System.out.println("O valor da convers�o em dolares �: " + result);
		sc.close();
	}
}
//Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em real.
//O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel com o usu�rio, para que seja apresentado o valor em moeda americana.