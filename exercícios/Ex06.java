package exercícios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero :");
		double num1 = sc.nextDouble();
		System.out.println("Digite um numero :");
		double num2 = sc.nextDouble();
		
		double div = num1/num2;
		System.out.println("O resultado da divisão dos valores é :" + div );
		sc.close();
	}
}
