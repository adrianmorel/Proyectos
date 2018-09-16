package paquetes;

import java.util.ArrayList;

public class Bicicleta extends Empleado {

	private String nombre;

	public Bicicleta(ArrayList<Paquete> listaPaquetes, String nombre) {
		super(listaPaquetes);
		this.nombre = nombre;
	}

	@Override
	public boolean puedeCargar(Paquete paquete) {
		if (paquete.getDistancia() < 200 && paquete.getVolumen() < 0.01) {
			return true;
		}
		return false;
	}

	@Override
	public void cargar(Paquete paquete) throws Exception {
		if (this.puedeCargar(paquete))
			this.listaPaquetes.add(paquete);
		else
			throw new Exception("No se puede cargar la wea" + this.nombre);
	}
}
