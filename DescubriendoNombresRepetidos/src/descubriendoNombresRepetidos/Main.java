package descubriendoNombresRepetidos;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Campamento c = Archivo.leer("00_Enunciado.in");
		Archivo.escribir("00_Enunciado.out", c.resolver());
	}

}
