package exemplo02;

public class Exemplo04 {
	public static void main(String[] args) {
		
		//apresentar valores maiores menores
		
		System.out.println(Math.max(10, 3));
		System.out.println(Math.min(10, 3));
		
		//apresentar valores maiores e menores determinados na variável
		
		int numero = 18;
		int numero01 = 13;

		System.out.println(Math.max(numero,numero01));
		System.out.println(Math.min(numero,numero01));
		
		//apresentar a raiz quadrada dos valores
		
		int num = 25;
		int num01 = 11;
		
		System.out.println(Math.sqrt(num));
		int sub = num01-num;
		//a sub apresenta valor negativo
		System.out.println("Subtração :"+sub);
		System.out.println(Math.abs(sub));
		
		// numero inteiro aleatório dentro do valor 100
		int valor = (int)((Math.random())*101);
		System.out.println(valor);
		
	}
}
