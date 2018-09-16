package codeGolf;

public class CodeGolf {

	boolean secuenciaCiclica(int[] s) {

		int b = 0, n = s[0];
		for (int a : s) {
			if(n > a) 
				b++;
			n = a;
		}
		if (s[0] < n)
			b++;
		return b < 2;
	}
}