package exercicios03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor : ");
		int val = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int val1 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int val2 = sc.nextInt();

		int result = (val*val)+(val1*val1)+(val2*val2);

		System.out.println("A soma dos quadrados dos três valores lidos é: " + result);
		sc.close();
	}
}
//Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à soma dos quadrados dos três valores lidos.