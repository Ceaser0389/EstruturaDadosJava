package aula014;

public class Aula014 {

	public static void main(String[] args) { // fila é um tipo abstrato de dados

		Fila fila = new Fila();
		
		fila.adicionar("Jão");
		fila.adicionar("Zé");
		fila.adicionar("Juca");
		fila.adicionar("Maria");
		fila.adicionar("Ana");
		
		System.out.println("Primeiro da Fila: " + fila.get());
		fila.remover();
		System.out.println("Primeiro da Fila: " + fila.get());
		
		
	}

}
