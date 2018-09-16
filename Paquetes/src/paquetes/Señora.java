package paquetes;

import java.util.ArrayList;

public class Se�ora extends Empleado {

	private String nombreSe�ora;

	public Se�ora(ArrayList<Paquete> listaPaquetes, String nombreSe�ora) {
		super(listaPaquetes);
		this.nombreSe�ora = nombreSe�ora;
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
			throw new Exception("No se puede cargar la wea" + this.nombreSe�ora);
	}

}
