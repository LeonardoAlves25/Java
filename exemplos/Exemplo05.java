package exemplos;

import java.util.Scanner;

public class Exemplo05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero :");
		int numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�o poss�i dia correspondente.");
			break;
			
		}
		sc.close();
	}

}

//fazer paginas 22,23,24,25,26 