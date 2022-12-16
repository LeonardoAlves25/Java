package exercícios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retangulo : ");
		float base = sc.nextFloat();
		System.out.println("Digite a altura do triangulo :");
		float altura = sc.nextFloat();
		float area = base*altura;
		System.out.println("A area total do retangulo é : "+area+"m²");
		sc.close();
	}
}
