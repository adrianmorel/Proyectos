package paquetes;

import java.util.ArrayList;

public class DeliveryBoy extends Empleado {

	private String nombreNene;

	public DeliveryBoy(ArrayList<Paquete> listaPaquetes, String nombreNene) {
		super(listaPaquetes);
		this.nombreNene = nombreNene;
	}

	@Override
	public boolean puedeCargar(Paquete paquete) {

		if (paquete.getPeso() < 45 && paquete.getDistancia() < 20 && listaPaquetes.size() < 1)
			return true;
		return false;
	}

	@Override
	public void cargar(Paquete paquete) throws Exception {
		if (this.puedeCargar(paquete))
			this.listaPaquetes.add(paquete);
		else
			throw new Exception("No se puede cargar la wea" + this.nombreNene);
	}
}
