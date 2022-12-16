package exercícios;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as dimensões do circulo");
		float raio = sc.nextFloat();
		float result = (float) (3.14*(raio*raio));
		System.out.println("A area total do circulo é: "+result);
		sc.close();
	}
}
