package exemplos;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {

		System.out.println("Dela��o Premiada");
		System.out.println("Jailson");
		System.out.print("_N�o pula linha_");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro :");
		float valor = sc.nextFloat();
		System.out.println("Digite um n�mero :");
		float valor2 = sc.nextFloat();
		float soma = valor+valor2;
		System.out.printf("O valor total da soma � : %.2f" , soma);
		
		if (soma>10) {
			System.out.println("O numero � maior que 10");
		} else{
			System.out.println("O numero � menor que 10");
		}
		sc.close();
		
	
  }
}
// bra�o curto - para m�todo main - digite "main" + "ctrl+space" + "enter"
// "ctrl + shift + F" organizar o c�digo;
// Int = inteiro // float = real //
// "ctrl + F" = finder -- substituir comandos 
// "System.out.printf("O valor da soma arredoando � : %.2f" , soma)"
// dentro do out.print o comando "\n" pula uma linha 