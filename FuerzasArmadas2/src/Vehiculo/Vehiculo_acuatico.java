package Vehiculo;

import Batalla.TipoDeBatalla;
import Vehiculos.Vehiculo;

public class Vehiculo_acuatico extends Vehiculo{
	

	private TipoDeBatalla tipo_batalla;
	
	public Vehiculo_acuatico(TipoDeBatalla tipo_batalla) {
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
