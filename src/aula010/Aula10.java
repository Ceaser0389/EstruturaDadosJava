package aula010;



public class   Aula10 {

	public static void main(String[] args) { //Selection Sort   complex O(N^2)
		
		
		int [] vetor = new int[10];
		
		 
		for (int i = 0; i < vetor.length; i++) {
			  vetor[i] =  (int) (Math.random() *vetor.length);	// O(N)
		}
		
		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		// Selection Sort
		int posicao_menor,aux;
		for (int i = 0; i < vetor.length; i++) {
			posicao_menor = i;
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posicao_menor]) {
					posicao_menor = j;
				}
			}
			aux =vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i]= aux;
		}
		
		// vetor Ordenado
		System.out.println("\n \nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}
	}

}
