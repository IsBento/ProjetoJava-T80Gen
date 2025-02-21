package ecommerce.model;

public class produzido extends ecommerce {
		
	private String produzido;
	/* Herdando da classe ecommerce
	Quem dirigiu o filme
	*/

	public produzido(String titulo, String genero, String tipo, int sku, String produzido) {
		super(titulo, genero, tipo, sku);
		this.produzido = produzido;
	}

	public String getProduzido() {
		return produzido;
	}

	public void setProduzido(String produzido) {
		this.produzido = produzido;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Dirigido por: " + this.produzido);
	}
	
}

