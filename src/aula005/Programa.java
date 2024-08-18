package aula005;

public class Programa {

	public static void main(String[] args) {
		
		/// lista ligada 
		
		ListaLigada <String>lista =  new  ListaLigada<String>();
		
		
		lista.adcionar("AC");
		lista.adcionar("BA");
		lista.adcionar("CE");
		lista.adcionar("DF");
		
		
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Último: " + lista.getUltimo().getValor());
		System.out.println("***********************************************");
//		System.out.println(lista.get(0).getValor());
//		System.out.println(lista.get(1).getValor());
//		System.out.println(lista.get(2).getValor());
//		System.out.println(lista.get(3).getValor());
		
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		// remover estado CE 
		lista.remover("BA");
		lista.remover("CE");
		lista.remover("AC");
		lista.remover("DF");
		
		System.out.println("Tamanho: "+lista.getTamanho());
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		
	}

}
