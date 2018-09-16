package mesada;

import java.util.ArrayList;

public class Deposito {

	ArrayList<Mesada> listaDeMesadas = new ArrayList<Mesada>();

	public Deposito(ArrayList<Mesada> listaDeMesadas) {
		this.listaDeMesadas = listaDeMesadas;
	}

	public ArrayList<Mesada> getListaDeMesadas() {
		return listaDeMesadas;
	}

	public int calcularMinimo() {

		int pilas = 0;
		for (int i = 0; i < this.listaDeMesadas.size(); i++) {
			int cantidadDeMesadasEnLasQueMePuedoPoner = 0;
			for (int j = 0; j < this.listaDeMesadas.size(); j++) {
				if (i != j) {
					if (listaDeMesadas.get(i).puedoApilar(listaDeMesadas.get(j))) {
						cantidadDeMesadasEnLasQueMePuedoPoner++;
					}
				}
			}
			if (cantidadDeMesadasEnLasQueMePuedoPoner == 0)
				pilas++;
		}
		return pilas;
	}
}
