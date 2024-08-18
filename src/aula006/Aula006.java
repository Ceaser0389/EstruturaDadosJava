package aula006;

import java.util.Scanner;

public class Aula006 { // busca linear

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 int[] vetor = new int[8];
	 
	 for (int i = 0; i < vetor.length; i++) {
		vetor[i] =  (int) (Math.random() * 100);
		System.out.println(vetor[i]);
	 }
		
	 System.out.println("Qual número vc busca?");
	 int buscado = sc.nextInt();
		
	 boolean achou = false;
	 for (int i = 0; i < vetor.length; i++) {
		if (vetor[i] == buscado) {
			achou = true;
			break;
		}
	 }
	 if (achou) {
		System.out.println("Achou");
	 } else {
		System.out.println("Não achou");
	 }
	
	 
	 
	}

}
