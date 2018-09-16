package wordWrap;

public class WordWrap {

	/*
	 * Se pasa una cadena y un cantidad de caracteres que debe tener por línea
	 * la cadena devuelta. Si la palabra es más larga el renglón se debe
	 * acomodar en varios renglones. Si la palabra es más corta que el renglón
	 * pero no entra, se debe colocar completa en el renglón de abajo
	 */

	public String wrap(String linea, int i) {

		int largoCadena = i;

		linea = normalizar(linea);

		if (linea.length() < i)
			largoCadena = linea.length();

		int espacio = linea.substring(0, largoCadena).lastIndexOf(" ");

		if (linea.length() <= i)
			return linea;

		if (espacio != -1) {
			if (linea.charAt(i) == ' ')
				return calcular(linea, i, i);
			return calcular(linea, i, espacio);
		}

		if (linea.charAt(i) == ' ')
			return calcular(linea, i, i);

		return linea.substring(0, i) + "\n" + wrap(linea.substring(i), i);
	}

	private String calcular(String linea, int i, int espacio) {

		return linea.substring(0, espacio) + "\n" + wrap(linea.substring(espacio + 1), i);
	}

	private String normalizar(String linea) {

		if (linea != " ")
			linea = linea.trim();

		while (linea.contains("  "))
			linea = linea.replace("  ", " ");

		return linea;
	}
}
