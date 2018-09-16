package luchadores;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Torneo torneo = ArchivoTorneo.leer("00_ejemplo.in");
		ArchivoTorneo.escribir("00_ejemplo.out", torneo.resolver());
	}
}
