package exercicios02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius");
		int celsius = sc.nextInt();
		float fahrenheit = (9*celsius+160)/5;
		System.out.println("A temperatura em graus fahrenheit �: "+fahrenheit);
		sc.close();
	}
}
//Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. A f�rmula de convers�o � F = (9*C + 160)/5, sendo
//F a temperatura em Fahrenheit e C a temperatura em Celsius.