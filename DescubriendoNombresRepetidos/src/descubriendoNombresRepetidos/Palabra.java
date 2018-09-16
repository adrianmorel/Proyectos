package descubriendoNombresRepetidos;

public class Palabra implements Comparable<Palabra> {
	String nombre;
	int apariciones;

	public Palabra(String nombre, int apariciones) {
		this.nombre = nombre;
		this.apariciones = apariciones;
	}

	@Override
	public int compareTo(Palabra otra) {
		return this.nombre.compareTo(otra.nombre);
	}

}
