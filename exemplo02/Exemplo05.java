package exemplo02;

public class Exemplo05 {
	public static void main(String[] args) {
		int cont = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			int valor = (int)((Math.random())*101);
			System.out.println(valor);
			cont++;
		}
		System.out.println("contagem :"+cont);
	}
}
