package exercícios;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor :");
		int num1 = sc.nextInt();
		System.out.println("Digite outro valor :");
		int num2 = sc.nextInt();
		int soma = num1+num2;
		System.out.println("O produto da soma é : "+soma);
		sc.close();
	}
}

