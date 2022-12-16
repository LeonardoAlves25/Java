package exercícios;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado :");
		int lado = sc.nextInt();
		
		int result = (lado*lado);
		System.out.println("A area total do quadrado é : "+result+"m²");
		
		sc.close();
	}
}
