package exercicios02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus fahrenheit :");
		int fahrenheit = sc.nextInt();
		float celsius = (fahrenheit-32)*(5/9);
		System.out.println("A temperatura em graus celsius �: "+celsius);
		sc.close();
	}
}
//Ler uma temperatura em graus Fahrenheit e apresent�-la convertida em graus Celsius.
//A f�rmula deconvers�o � C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius