package ecommerce.model;

public class produzido extends ecommerce {
		
	private String produzido;
	// Herdando da classe ecommerce

	public produzido(String titulo, String genero, String tipo, String produzido) {
		super(titulo, genero, tipo);
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
		System.out.println("Produzido por: " + this.produzido);
	}
}

