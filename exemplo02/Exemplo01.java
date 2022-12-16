package exemplo02;

public class Exemplo01 {
	 public static void main(String[] args) {
		
		 String nome = "Leonardo Alves";
		 int qtd = nome.length();
		 System.out.println(nome);
		 System.out.println(qtd);
		 
		 String nomeMai = nome.toUpperCase();
		 System.out.println(nomeMai);
		 
		 String nomeMin = nome.toLowerCase();
		 System.out.println(nomeMin);
		 
		 String texto = "Bom dia, dia bom leo, bom dia";
		 int localizar = texto.indexOf("leo");
		 
		 System.out.println(localizar); 
		 
		 String primeiroNome = "Leonardo"; 
		 String segundoNome = "Alves";
		 
		 System.out.println(primeiroNome+" "+segundoNome);
		 System.out.println(primeiroNome.concat(segundoNome)); //
		 
	}
}
