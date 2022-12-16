package exemplos;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {

		System.out.println("Delação Premiada");
		System.out.println("Jailson");
		System.out.print("_Não pula linha_");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro :");
		float valor = sc.nextFloat();
		System.out.println("Digite um número :");
		float valor2 = sc.nextFloat();
		float soma = valor+valor2;
		System.out.printf("O valor total da soma é : %.2f" , soma);
		
		if (soma>10) {
			System.out.println("O numero é maior que 10");
		} else{
			System.out.println("O numero é menor que 10");
		}
		sc.close();
		
	
  }
}
// braço curto - para método main - digite "main" + "ctrl+space" + "enter"
// "ctrl + shift + F" organizar o código;
// Int = inteiro // float = real //
// "ctrl + F" = finder -- substituir comandos 
// "System.out.printf("O valor da soma arredoando é : %.2f" , soma)"
// dentro do out.print o comando "\n" pula uma linha 