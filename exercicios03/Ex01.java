package exercicios03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int A = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int B = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int C = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int D = sc.nextInt();
		
		int adicao1 = A+B;
		int adicao2 = A+C;
		int adicao3 = A+D;
		int adicao4 = B+C;
		int adicao5 = B+D;
		int adicao6 = C+D;
		

		int mult1 = A*B;
		int mult2 = A*C;
		int mult3 = A*D;
		int mult4 = B*C;
		int mult5 = B*D;
		int mult6 = C*D;
		
		System.out.println("Os resultados das somas e multiplica��es s�o: ");
	}
}


/*
 * Ler quatro n�meros inteiros e apresentar o resultado da adi��o e
 * multiplica��o, baseando-se na utiliza��o do conceito da propriedade
 * distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D, devem ser
 * somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e
 * por fim C com D. Perceba que ser� necess�rio efetuar seis opera��es de adi��o
 * e seis opera��es de multiplica��o e apresentar doze resultados de sa�da.
 */