package aula007;

import java.util.Scanner;

public class aula007 {         //busca binária

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[8];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 2 ;
		}
		
		System.out.println("Qual número vc busca?");
		int buscado = sc.nextInt();
		
		boolean achou = false;  // partindo a ideia que o elemento não existe
		int inicio =0;
		int fim = vetor.length  -1;
		int meio;
		
		while (inicio <= fim) {
			meio =  (int) ((inicio + fim) /2);
			if(vetor[meio] == buscado) {
				achou = true;
				break;
			}else if (vetor[meio] < buscado) {
				inicio = meio + 1;
			}
			else {
				fim = meio - 1;
			}
		}
		if(achou ==true) {
			System.out.println("Achou");
		}else {
			System.out.println("Não Achou");
		}

	}

}
