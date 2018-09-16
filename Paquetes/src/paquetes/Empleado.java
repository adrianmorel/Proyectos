package paquetes;

import java.util.ArrayList;

public abstract class Empleado {
	
	protected ArrayList<Paquete> listaPaquetes = new ArrayList<Paquete>(); 
	
	public Empleado(ArrayList<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}

	public abstract boolean puedeCargar(Paquete paquete);
	public abstract void cargar(Paquete paquete) throws Exception;
	

}
