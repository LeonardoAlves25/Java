package exercicios03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor (inteiro): ");
		int val = sc.nextInt();
		System.out.println("Digite o segundo valor (inteiro): ");
		int val2 = sc.nextInt();
		
		int result = val-val2;
		
		System.out.println("O quadrado da diferença dos valores é: "+result*result);
		sc.close();
	}
}
// Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.