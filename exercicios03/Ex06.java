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

		System.out.println("A soma dos quadrados dos tr�s valores lidos �: " + result);
		sc.close();
	}
}
//Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final � soma dos quadrados dos tr�s valores lidos.