package descubriendoNombresRepetidos;

import java.util.ArrayList;
import java.util.Collections;

public class Campamento {

	protected ArrayList<Palabra> listaDeNombres;
	private int podio;

	public Campamento(ArrayList<Palabra> lista, int cantidadDeNombres) {
		this.listaDeNombres = lista;
		this.podio = cantidadDeNombres;
	}

	public ArrayList<Palabra> resolver() {
		
		Collections.sort(listaDeNombres);
//		Campamento c = new Campamento(listaDeNombres, podio);
		return listaDeNombres;
		}

}
