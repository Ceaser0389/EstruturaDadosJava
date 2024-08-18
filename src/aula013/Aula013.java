package aula013;

public class Aula013 {

	public static void main(String[] args) { // Quick SORT
	
		
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			  vetor[i] =  (int) (Math.random() *vetor.length);	
		}
		
		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
		}
		
		quickSort(vetor, 0, vetor.length -1);
		
		System.out.println("\n\nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
		}
	}
		
	static  void quickSort(int[] vetor, int esquerda, int direita) {
		 if (esquerda < direita) {
			int p = particao(vetor,esquerda,direita);
			quickSort(vetor, esquerda,p);
			quickSort(vetor, p + 1, direita);
		}
	}
	
	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivo = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		 while(true) {
			 do {
				 i++;
			 }while(vetor[i] < pivo);
			 do {
				 j--;
			 }while(vetor[j] >pivo);
			 if (i >=j) {
				return j;
			}
			 int aux = vetor[i];
			 vetor[i] = vetor[j];
			 vetor[j] = aux;
		 }
		
	}
}
