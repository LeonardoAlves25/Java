package exemplo03;

public class Exemplo02 {
	public static void main(String[] args) {
		
		String [] carros = {"volvo", "BMW", "Ford","Mazda"};
		
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		
		carros [1] = "Chevrolet";
		
		System.out.println(carros[1]);
		System.out.println(carros.length);
		
		
		int [] anyNum = {20,21,22,23,24};
		
		System.out.println(anyNum[0]);
		System.out.println(anyNum[1]);
		System.out.println(anyNum[2]);
		System.out.println(anyNum[3]);
		System.out.println(anyNum[4]);
		
		anyNum [4] = 56;
		
		System.out.println(anyNum[4]);
		System.out.println(anyNum.length);
	}
}
