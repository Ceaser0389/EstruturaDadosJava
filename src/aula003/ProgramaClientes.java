package aula003;

public class ProgramaClientes {

	public static void main(String[] args) {
	
		ListaLigada<Cliente> clientes = new ListaLigada<>();
		
		clientes.adcionar(new Cliente("123","João"));
		clientes.adcionar(new Cliente("124","Juca"));
		clientes.adcionar(new Cliente("125","Ze"));
		
		
		System.out.println("Tamanho: "+clientes.getTamanho());
		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println(clientes.get(i).getValor());
		}
		
		
		
	}

}
