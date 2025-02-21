package ecommerce.model;

public abstract class ecommerce {

	private String titulo;
	private String genero;
	private String tipo;
	private int sku;
	
	public ecommerce(String titulo, String genero, String tipo, int sku) {
		this.titulo = titulo;
		this.genero = genero;
		this.tipo = tipo;
		this.sku = sku;
	}


	public String getTitulo() {
		return titulo;
	}

	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}

	
	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public int getSku() {
		return sku;
	}


	public void setSku(int sku) {
		this.sku = sku;
	}

	
	public void visualizar() {
			
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do disco:");
		System.out.println("***********************************************************");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Tipo de disco: " + this.tipo);
		System.out.println("Código do disco: " + this.sku);
		}
  
}
	
	