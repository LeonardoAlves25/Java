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

		System.out.println("O primeiro resultado �: " + P);
		System.out.println("O segundo resultado �: " + P1);
		System.out.println("O terceiro resultado �: " + S);
		sc.close();
	}
}
// Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis A, B, C e D).
//Ao final o programa deve apresentar o resultado do produto (vari�vel P) do primeiro com o terceiro valor,
//e o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado da soma (vari�vel S) do segundo com o quarto valor.