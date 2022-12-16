package exemplos;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite um valor :");
		int valor = sc.nextInt();
		System.out.println(valor);
		sc.close();
	}
}
