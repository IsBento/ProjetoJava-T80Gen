package ecommerce.model;

public class disco extends ecommerce {
	
	private String disco;
	/* Herdando da classe ecommerce
	 * Define o artista (cantor ou banda)
	 */

	public disco(String titulo, String genero, String tipo, int sku, String disco) {
		super(titulo, genero, tipo, sku);
		this.disco = disco;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O artista é: " + this.disco);
	}
}



