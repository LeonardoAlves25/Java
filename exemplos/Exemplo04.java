package exemplos;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sua idade? :");
		
		int idade = sc.nextInt();
		if (idade < 16) {
			System.out.println("N�o pode votar");
		}else if (idade >= 16 && idade <=64) {
			System.out.println("Voto obrigat�rio");
		}else {
			System.out.println("Voto n�o obrigat�rio");
		}
		sc.close();
	}
}
