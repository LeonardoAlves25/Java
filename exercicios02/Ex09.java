package exercicios02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da presta��o em atraso: ");
		float valor = sc.nextFloat();
		System.out.println("Digite o valor da taxa de atrasdo da presta��o: ");
		float taxa = sc.nextFloat();
		System.out.println("Digite a quantidade de meses que a presta��o est� em atrasdo: ");
		int tempo = sc.nextInt();
		
		float total = (valor+(valor*taxa/100)*tempo);
		System.out.println("O total da sua d�vida �: "+total);
		sc.close();
	}
}

//Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).