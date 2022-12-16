package exercicios02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário mensal atual: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o percentual do reajuste");
		float reajuste = sc.nextFloat();
		
		float novoSalario = (salario*(reajuste/100))+salario;
		System.out.println("Seu novo salário é :"+novoSalario);
		sc.close();
	}
}
