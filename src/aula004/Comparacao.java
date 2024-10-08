package aula004;

import java.util.ArrayList;


import aula005.IteratorListaLigada;

public class Comparacao {

	public static void main(String[] args) {
		
		
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		
		ArrayList<Integer> vetor = new ArrayList<Integer>(); 
		
		// Adicionar elementos
		
		int limite =1000;
		long tempoInicial = System.currentTimeMillis();
		long tempoFinal;
		for (int i = 0; i< limite; i++) {
			vetor.add(i);
			
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou "+limite+ " elementos no vetor");
		System.out.println( tempoFinal - tempoInicial);

		System.out.println("***********************");
		
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i< limite; i++) {
			lista.adcionar(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou "+limite+ " elementos no lista");
		System.out.println( tempoFinal - tempoInicial);
		
		System.out.println("******************");
		
		// ler valores
		//vetor
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i< vetor.size(); i++) {
			 vetor.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de leitura do vetor");
		System.out.println( tempoFinal - tempoInicial);
		
		//lista
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i< lista.getTamanho(); i++) {
			 lista.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de leitura do lista");
		System.out.println( tempoFinal - tempoInicial);
	}

}
