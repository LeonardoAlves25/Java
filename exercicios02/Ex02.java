package exercicios02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o total de votos brancos");
		float brancos = sc.nextFloat();
		System.out.println("Digite o total de votos nulos");
		float nulos = sc.nextFloat();
		System.out.println("Digite o total de votos validos");
		float validos = sc.nextFloat();

		float total = brancos + validos + nulos;
		System.out.println("\nO numero total de votos é: " + total);

		brancos = (brancos / 100)*100;
		nulos = (nulos / 100)*100;
		validos = (validos / 100)*100;
		System.out.println("\nO percentual de votos brancos é : " + brancos + "%");
		System.out.println("\nO percentual de votos nulos é : " + nulos + "%");
		System.out.println("\nO percentual de votos validos é : " + validos + "%");
		sc.close();
	}
}
