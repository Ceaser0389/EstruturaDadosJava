package aula015;

public class Aula015 {

	public static void main(String[] args) { // Pilha é um tipo abstrato de dados

	
		Pilha pilha = new Pilha();
		
		pilha.adicionar("E");
		pilha.adicionar("B");
		pilha.adicionar("Z");
		pilha.adicionar("D");
		pilha.adicionar("C");
		
		System.out.println("Topo: " + pilha.get());
		
		pilha.remover();
		
		System.out.println("Novo Topo: " + pilha.get());
		
	}

}
