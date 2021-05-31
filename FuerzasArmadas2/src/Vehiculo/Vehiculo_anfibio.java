package Vehiculo;

import Batalla.TipoDeBatalla;
import Vehiculos.Vehiculo;

public class Vehiculo_anfibio extends Vehiculo{

	private TipoDeBatalla tipo_batalla;
	
	public Vehiculo_anfibio(TipoDeBatalla tipo_batalla) {
	super();
	this.tipo_batalla=tipo_batalla;
	}

	public TipoDeBatalla getTipo_batalla() {
		return tipo_batalla;
	}

	public void setTipo_batalla(TipoDeBatalla tipo_batalla) {
		this.tipo_batalla = tipo_batalla;
	}
}
