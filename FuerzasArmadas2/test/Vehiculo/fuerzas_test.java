package Vehiculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Batalla.Batalla;
import Batalla.TipoDeBatalla;

import Vehiculos.Vehiculo;


class fuerzas_test {


	@Test
	public void queSePuedaCrearUnVehiculo() {
		Vehiculo vehiculo = new Vehiculo();
		Vehiculo_terrestre auto1= new Vehiculo_terrestre(TipoDeBatalla.TERRESTRE);
		Vehiculo_aereo avioneta1 = new Vehiculo_aereo(TipoDeBatalla.AEREA);
		Vehiculo_acuatico submarino1 = new Vehiculo_acuatico(TipoDeBatalla.ACUATICA);
		Vehiculo_anfibio todoterreno1 = new Vehiculo_anfibio(TipoDeBatalla.TERRESTRE_ACUATICA);
		Vehiculo_hidroavion hidroavioneta1 = new Vehiculo_hidroavion(TipoDeBatalla.AEREA_ACUATICA);
		
	}
	@Test
	public void queSePuedaCrearUnConvoy() {
		Convoy ejercito = new Convoy();
	}
	
	@Test
	public void queSePuedaAgregarUnVehiculoAlConvoy() {
		Convoy ejercito = new Convoy();
		Vehiculo_terrestre auto1= new Vehiculo_terrestre(TipoDeBatalla.TERRESTRE);
		ejercito.vehiculosEnConvoy.add(auto1);
	}
	
	@Test
	public void queSePuedaQuitarUnVehiculoAlConvoy() {
		Convoy ejercito = new Convoy();
		Vehiculo_terrestre auto1= new Vehiculo_terrestre(TipoDeBatalla.TERRESTRE);
		ejercito.vehiculosEnConvoy.add(auto1);
		ejercito.vehiculosEnConvoy.remove(auto1);
		assertNotNull(ejercito);
	}
	
	@Test
	public void queSePuedaCrearUnaBatalla() {
		Batalla general = new Batalla("batalla1",TipoDeBatalla.TERRESTRE);
		assertNotNull(general);
	}
	
	@Test
	public void queSePuedaAgregarUnVehiculoALaBatalla() {
		Batalla general = new Batalla("batalla1",TipoDeBatalla.TERRESTRE);
		Vehiculo_terrestre auto1= new Vehiculo_terrestre(TipoDeBatalla.TERRESTRE);
		Vehiculo_acuatico submarino1 = new Vehiculo_acuatico(TipoDeBatalla.ACUATICA);
		assertEquals(general.getTipo_batalla(),auto1.getTipo_batalla());
	
	}
}
