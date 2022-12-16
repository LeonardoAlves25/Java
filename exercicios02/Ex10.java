package exercicios02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro texto que irá ser trocado: ");
		String t1 = sc.next();
		System.out.println("Digite o segundo texto que irá ser trocado: ");
		String t2 = sc.next();

		String manter = t1;
		t1 = t2;
		System.out.println("O primeiro texto que foi trocado é: "+t1);
		System.out.println("O segundo texto que foi trocado é: "+manter);
		sc.close();
	}
}
//Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.