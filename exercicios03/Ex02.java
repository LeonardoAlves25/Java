package exercicios03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa");
		float comp = sc.nextFloat();
		System.out.println("Digite o largura da caixa");
		float larg = sc.nextFloat();
		System.out.println("Digite o altura da caixa");
		float alt = sc.nextFloat();
		
		float vol = comp*larg*alt;
		
		System.out.println("O volume total da caixa é: "+vol);
		sc.close();
	}
}


//Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.