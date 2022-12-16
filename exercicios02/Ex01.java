package exercicios02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int anos = sc.nextInt();
		System.out.println("Digite a quantidade de meses desde o seu último aniversário: ");
		int meses = sc.nextInt();
		int dias = ((anos*12)*30)+(meses*30);
		System.out.println("Seu numero de dias vividos é: "+dias);
		sc.close();
	}
}
