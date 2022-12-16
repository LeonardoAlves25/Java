package exemplo03;

public class Exemplo04 {
	public static void main(String[] args) {
		
		String[] nomes = {"Leo","Carol","Bia","Marcia","Mônica"};
		int[] numeros = {10,11,12,13,14};
		String[] emails = {"Leo@gmail.com","Carol@yahoo.com","Bia@outlook.com","Marcia@microsoft.com","Mônica@bing.com"};
		Boolean[] boo = {false,true,false,true,false};
		int[] idade = {18,19,20,21,22};
		
		
		
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("A quantidade de posições apresentadas foram :"+nomes.length);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("A quantidade de posições apresentadas foram :"+numeros.length);
		
		for (int i = 0; i < emails.length; i++) {
			System.out.println(emails[i]);
		}
		
		System.out.println("A quantidade de posições apresentadas foram :"+emails.length);
		
		for (int i = 0; i < boo.length; i++) {
			System.out.println(boo[i]);
		}
		
		System.out.println("A quantidade de posições apresentadas foram :"+boo.length);
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
		
		System.out.println("A quantidade de posições apresentadas foram :"+idade.length);
		
	}
}
