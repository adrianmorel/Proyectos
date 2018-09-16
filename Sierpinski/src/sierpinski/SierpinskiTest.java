package sierpinski;

import org.junit.Assert;
import org.junit.Test;

public class SierpinskiTest {

	@Test
	public void quePruebeElPrimerPrimo() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esPrimo(1));
	}
	
	@Test
	public void quePruebeElSegundoPrimo() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esPrimo(2));
	}
	
	@Test
	public void quePruebeElTercerPrimo() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esPrimo(3));
	}
	
	@Test
	public void quePruebeAlgunPrimo() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(false, k.esPrimo(63));
	}
	
	@Test
	public void quePruebeOtroPrimo() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(false, k.esPrimo(100));
	}
	
	@Test
	public void quePruebeEl1() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(false, k.esSierpinski(1));
	}
	
	@Test
	public void quePruebeEl45() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(false, k.esSierpinski(45));
	}
	
	@Test
	public void quePruebeEl89() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(false, k.esSierpinski(89));
	}
	
	@Test
	public void quePruebeEl4847() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(4847));
	}
	
	@Test
	public void quePruebeEl78557() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(78557));
	}
	
	@Test
	public void quePruebeEl5359() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(5359));
	}
	
	@Test
	public void quePruebeEl10223() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(10223));
	}
	
	@Test
	public void quePruebeEl19249() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(19249));
	}
	
	@Test
	public void quePruebeEl27653() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(27653));
	}
	
	@Test
	public void quePruebeEl69109() {
		Sierpinski k = new Sierpinski();
		Assert.assertEquals(true, k.esSierpinski(69109));
	}
	
}
