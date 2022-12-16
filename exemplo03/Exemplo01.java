package exemplo03;

public class Exemplo01 {
	public static void main(String[] args) {
		
		//maneira irregular
		
		/*String nome = "Jailson";
		System.out.println(nome);
		String nome1 = "Leonardo";
		System.out.println(nome1);
		String nome2 = "Gustavo";
		System.out.println(nome2);
		String nome3 = "Marcos";
		System.out.println(nome3);
		String nome4 = "Pedro";
		System.out.println(nome4);*/
		
		//maneira apropriada com arrays
		
		String [] nomes = {"Jailson","Leonardo","Marcus","Gustavo","Pedro"};
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		System.out.println(nomes[3]);
		System.out.println(nomes[4]);
	}
}
