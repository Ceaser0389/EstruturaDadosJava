package aula014;

public class Elemento  {
   
	private String valor;
	private Elemento proximo;            
	
	
	public Elemento( String novoValor) {
		this.valor = novoValor;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
	  /***
	   * lista ligada sabe q seu prox,tamanho dinamico, lista ligada,
	   *  duro dela que temos que percorrer
	   * 
	   */
}        
