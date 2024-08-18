package aula008;

public class Aula008 {

	// BUBBLE SORT
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] =  (int)  (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		// BUBLE SORT O(N2)
		int aux;
		for (int i = 0; i < vetor.length; i++) {                  // O(N)
			for (int j = i + 1; j < vetor.length; j++) {          // O(N)
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		
		System.out.println("Vetor ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}

}
