package exerc�cios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro : ");
		int numero = sc.nextInt();
		numero=numero-1;
		System.out.println("O numero antecessor � : "+numero);
		sc.close();
	}
}
