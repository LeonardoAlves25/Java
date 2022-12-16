package exemplos;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sua idade? :");
		
		int idade = sc.nextInt();
		if (idade < 16) {
			System.out.println("Não pode votar");
		}else if (idade >= 16 && idade <=64) {
			System.out.println("Voto obrigatório");
		}else {
			System.out.println("Voto não obrigatório");
		}
		sc.close();
	}
}
