package exemplo04;

import java.util.Scanner;


public class Exemplo05 {
	
	
	public static void myMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String fname = sc.next();
		System.out.println("Digite uma idade");
		int age = sc.nextInt();
		System.out.println("O nome é : "+fname+"\n idade é: "+age);
		sc.close();
	}
	
	
	public static void main(String[] args) {
		myMethod();
	}
	
}
