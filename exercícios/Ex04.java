package exercícios;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num1 = sc.nextInt();
		System.out.println("Digite outro numero");
		int num2 = sc.nextInt();
		int sub = num1 - num2;
		System.out.println("o resultado da subtração dos valores é : " + sub);
		sc.close();
	}
}
