package exercicios03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int A = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int C = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		int D = sc.nextInt();

		int P= A+C;
		int P1 = P+C;
		int S = B+D;

		System.out.println("O primeiro resultado é: " + P);
		System.out.println("O segundo resultado é: " + P1);
		System.out.println("O terceiro resultado é: " + S);
		sc.close();
	}
}
// Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D).
//Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor,
//e o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma (variável S) do segundo com o quarto valor.