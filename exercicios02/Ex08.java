package exercicios02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo de dura��o da viagem (em horas): ");
		int tempo = sc.nextInt();
		System.out.println("Digite a velocidade m�dia durante a viagem");
		int vm = sc.nextInt();
		
		int distancia = (tempo*vm);
		float litros = (distancia/12);
		
		System.out.println("A velociade m�dia da viagem foi: "+vm+"Km/h");
		System.out.println("O tempo gasto na viagem foi: "+tempo+" horas");
		System.out.println("A dist�ncia percorrida na viagem foi: "+distancia+"km");
		System.out.println("A quantidade de litros usado na viagem foi: "+litros+"L");
		sc.close();
	}
}

 /*Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto
(TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem. Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da
dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade
m�dia (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/