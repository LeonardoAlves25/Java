package exerc�cios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero :");
		int num1 = sc.nextInt();
		System.out.println("Digite um numero :");
		int num2 = sc.nextInt();
		int mult = num1 * num2;
		System.out.println("O resultado da multiplica��o dos valores � :"+mult);
		sc.close();
	}
}
