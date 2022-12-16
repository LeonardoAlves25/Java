package exemplo03;
import java.util.Scanner;

public class Exemplo05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Digite um nome :");
		    String nome[] = new String[10];
			nome[i] = sc.next();
		}
		sc.close();
	}
}


//String resultado = (numero==10)?"Numero maior que 10":"Numero meno que 10";