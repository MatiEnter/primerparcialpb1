package Batalla;

public class Batalla {

	private String nombre_batalla;
	private TipoDeBatalla tipo_batalla;
	
	public Batalla(String nombre_batalla, TipoDeBatalla tipo_batalla) {
		this.nombre_batalla=nombre_batalla;
		this.tipo_batalla=tipo_batalla;
	}

	public String getNombre_batalla() {
		return nombre_batalla;
	}

	public void setNombre_batalla(String nombre_batalla) {
		this.nombre_batalla = nombre_batalla;
	}

	public TipoDeBatalla getTipo_batalla() {
		return tipo_batalla;
	}

	public void setTipo_batalla(TipoDeBatalla tipo_batalla) {
		this.tipo_batalla = tipo_batalla;
	}

}

