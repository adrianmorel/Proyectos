package wordWrap;

import org.junit.Assert;
import org.junit.Test;

public class WordWrapTest {
	
	@Test
	public void quePruebeQueExista() {
		WordWrap linea = new WordWrap();
		Assert.assertEquals(" ", linea.wrap(" ", 1));
	}
	
	@Test
	public void queDevuelvaLaMismaPalabra() {
		WordWrap linea = new WordWrap();
		Assert.assertEquals("hola", linea.wrap("hola", 4));
	}
	
	@Test
	public void queCorteEnUnEspacio() {
		WordWrap linea = new WordWrap();
		Assert.assertEquals("hola\npepe", linea.wrap("hola pepe", 4));
	}
	
	@Test 
	public void dosPalabrasEnUnaLinea(){
		WordWrap linea = new WordWrap();
		Assert.assertEquals("hola pepe", linea.wrap("hola pepe", 10));
	}
	
	@Test 
	public void unaPalabrasEnDosLineas(){
		WordWrap linea = new WordWrap();
		Assert.assertEquals("hola\nPaol", linea.wrap("holaPaol", 4));
	}
	
	@Test 
	public void unaPalabrasEnNLineas(){
		WordWrap linea = new WordWrap();
		Assert.assertEquals("inc\nrei\nble", linea.wrap("increible", 3));
	}
	
	@Test
	public void espaciosEnLosExtremos(){
		WordWrap linea = new WordWrap();
		Assert.assertEquals("eje\nmpl\no", linea.wrap(" ejemplo ", 3));
	}
	
	@Test 
	public void finalBossLv5(){
		
		WordWrap linea = new WordWrap();
		Assert.assertEquals("la casa\nes\nlinda", linea.wrap("la casa es linda", 7));
	}
	
	@Test
	public void espaciosDeMas(){
		WordWrap linea = new WordWrap();
		Assert.assertEquals("con espacios de mas", linea.wrap("con   espacios de  mas ", 25));
	}
	
}
