package exercícios;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo :");
		int base = sc.nextInt();
		System.out.println("Digite a altura do triangulo :");
		int altura = sc.nextInt();
		
		int area = base*altura/2;
		System.out.println("A area total do triangulo é : "+area+"m²");
		
		sc.close();
	}
}
