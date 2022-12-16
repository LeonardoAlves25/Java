package exemplo02; 
import java.util.Scanner;

public class Desafio_jaja {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero ente 0 e 100");
		int num = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i <= 100; i++) {
			
			int valor = (int)(Math.random()*101);
			System.out.println(valor);
			
			if(valor==num) {
				count = count+1;
			}
		}
		System.out.println("O numero de vezes que o valor digitado se repete é:  "+count);
		sc.close();
	}
	
}
