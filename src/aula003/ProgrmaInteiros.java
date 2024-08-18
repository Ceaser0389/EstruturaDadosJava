package aula003;

public class ProgrmaInteiros {

	public static void main(String[] args) {
	
		ListaLigada<Integer> numeros = new ListaLigada<Integer>();
		numeros.adcionar(3);
		numeros.adcionar(4);
		numeros.adcionar(5);
		
		System.out.println("Tamanho: "+numeros.getTamanho());
		for (int i = 0; i < numeros.getTamanho(); i++) {
			System.out.println(numeros.get(i).getValor());
		}
		
		

	}

}
