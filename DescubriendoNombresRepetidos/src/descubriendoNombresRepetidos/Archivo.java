package descubriendoNombresRepetidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

	static Campamento leer(String path) throws FileNotFoundException {

		File archivo = new File(path);
		Scanner sc = new Scanner(archivo);
		int cantidadDeChicos = sc.nextInt();
		int cantidadDeNombres = sc.nextInt();
		sc.nextLine();
		ArrayList<Palabra> lista = new ArrayList<Palabra>();
		for (int i = 0; i < cantidadDeChicos; i++) {
			lista.add(new Palabra(sc.nextLine(), 1));
			System.out.println(lista.get(i));
		}
		sc.close();

		return new Campamento(lista, cantidadDeNombres);
	}

	static void escribir (String path, ArrayList<Palabra> l) throws FileNotFoundException{
		File archivo = new File(path);
		PrintWriter pw = new PrintWriter(archivo);
		for (int i = 0; i < l.size(); i++) {
			pw.println(l.get(i));
		}
		pw.close();
		
	}
}
