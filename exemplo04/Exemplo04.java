package exemplo04;

public class Exemplo04 {
	
	public static void myMethod(String fname, int age) {
		System.out.println(fname+" is "+age+" years old");
	}
	
	public static void main(String[] args) {
		myMethod("Liam", 5);
		myMethod("Wilson", 51);
		myMethod("Anja", 23);
	}
}
