package luchadores;

public class Torneo {
	private Luchador luchadores [];

	public Torneo(Luchador[] luchadores) {
		super();
		this.luchadores = luchadores;
	}

	public int[] resolver() {
		
		int tama�o = this.luchadores.length;
		int [] salida = new int [tama�o];
		
		for(int i = 0; i < tama�o; i++){
			Luchador currentFighter = this.luchadores[i];
			for(int j = 0; j < tama�o; j++){
				if(i != j && currentFighter.domina(this.luchadores[j]))
					salida[i]++;
			}
				
		}
			
		return salida;
	}
	
	
}
