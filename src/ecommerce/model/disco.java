package ecommerce.model;

public class disco extends ecommerce {
	
	private String disco;
	
	public disco(String titulo, String genero, String tipo, String disco) {
		super(titulo, genero, tipo);
		this.disco = disco;
	}
	
	// Herdando da classe ecommerce
	
	public String getDisco() {
		return disco;
	}


	public void setDisco(String edisco) {
		this.disco = disco;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Esse lançamento é: " + this.disco);
	}
}



