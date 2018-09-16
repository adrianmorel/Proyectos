package paquetes;

import java.util.ArrayList;

public class Señora extends Empleado {

	private String nombreSeñora;

	public Señora(ArrayList<Paquete> listaPaquetes, String nombreSeñora) {
		super(listaPaquetes);
		this.nombreSeñora = nombreSeñora;
	}

	@Override
	public boolean puedeCargar(Paquete paquete) {

		if (paquete.getPeso() < 50 && paquete.getDistancia() < 30 && listaPaquetes.size() < 15) {
			return true;
		}
		return false;
	}

	@Override
	public void cargar(Paquete paquete) throws Exception {
		if (this.puedeCargar(paquete))
			this.listaPaquetes.add(paquete);
		else
			throw new Exception("No se puede cargar la wea" + this.nombreSeñora);
	}

}
