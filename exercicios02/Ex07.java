package exercicios02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata: ");
		float raio = sc.nextFloat();
		System.out.println("Digite a altura da lata: ");
		float altura = sc.nextFloat();
		float result = (float) (3.14*(raio*raio)*altura);
		System.out.println("O volume da lata é: "+result);
		sc.close();
	}
}
//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = ?*Raio2*Altura