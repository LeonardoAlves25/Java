package exerc�cios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero :");
		double num1 = sc.nextDouble();
		System.out.println("Digite um numero :");
		double num2 = sc.nextDouble();
		
		double div = num1/num2;
		System.out.println("O resultado da divis�o dos valores � :" + div );
		sc.close();
	}
}
