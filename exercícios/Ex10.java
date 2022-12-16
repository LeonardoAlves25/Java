package exercícios;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a diagonal maior do losando :");
		int diagonalMai = sc.nextInt();		
		System.out.println("Digite a diagonal menor do losando :");
		int diagonalMen = sc.nextInt();
		
		int area = (diagonalMai*diagonalMen)/2;
		System.out.println("A area total do losango é :"+area+"m²");
		
		sc.close();
	}
}


//a=d.d/2