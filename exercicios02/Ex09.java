package exercicios02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação em atraso: ");
		float valor = sc.nextFloat();
		System.out.println("Digite o valor da taxa de atrasdo da prestação: ");
		float taxa = sc.nextFloat();
		System.out.println("Digite a quantidade de meses que a prestação está em atrasdo: ");
		int tempo = sc.nextInt();
		
		float total = (valor+(valor*taxa/100)*tempo);
		System.out.println("O total da sua dívida é: "+total);
		sc.close();
	}
}

//Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).