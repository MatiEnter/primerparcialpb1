package Vehiculo;

import Batalla.TipoDeBatalla;
import Vehiculos.Vehiculo;

public class Vehiculo_terrestre extends Vehiculo {
	private TipoDeBatalla tipo;
	
	public Vehiculo_terrestre(TipoDeBatalla tipo_batalla) {
	super();
	this.tipo=tipo_batalla;
	}

	public TipoDeBatalla getTipo_batalla() {
		return tipo;
	}

	public void setTipo_batalla(TipoDeBatalla tipo_batalla) {
		this.tipo = tipo_batalla;
	}
}
