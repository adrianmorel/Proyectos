package codeGolf;


import org.junit.Assert;
import org.junit.Test;

public class CodeGolfTest {

	@Test
	public void ejemplo1() {
		int []vector = {1, 4, 10, -2, 0};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(true, obj.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo2() {
		int[] vector = {-2, 0, -1};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(false, obj.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo3() {
		int[] vector = {1};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(true, obj.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo4() {
		int[] vector = {1, 2, 3};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(true, obj.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo5() {
		int[] vector = {-100, -98, -96, -94, -92, -90, -88, -86, -84, -82,
							-80, -78, -76, -74, -72, -70, -68, -66, -64, -62,
							-60, -58, -56, -54, -52, -50, -48, -46, -44, -42,
							-40, -38, -36, -34, -32, -30, -28, -26, -24, -22,
							-20, -18, -16, -14, -12, -10, -8, -6, -4, -2,
							0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
							22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
							42, 44, 46, 48, 50, 52, 54, 56, 58, 60,
							62, 64, 66, 68, 70, 72, 74, 76, 78, 80,
							82, 84, 86, 88, 90, 92, 94, 96, 98, 100};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(true, obj.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo6() {
		int [] vector = {-100, -98, -96, -94, -92, -90, -88, -86, -84, -82,
							-80, -78, -76, -74, -72, -70, -68, -66, -64, -62,
							-60, -58, -56, -54, -52, -50, -48, -46, -44, -42,
							-40, -38, -36, -34, -32, -30, -28, -26, -24, -22,
							-20, -18, -16, -14, -12, -10, -8, -6, -4, -2,
							0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
							22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
							42, 44, 46, 48, 50, 52, 54, 56, 58, 60,
							62, 64, 66, 68, 70, 72, 74, 76, 78, 80,
							82, 84, 86, 88, 90, 92, 94, 96, 98, 0};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(false, obj.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo7() {
		int[] vector = {2, 3, 7, 4, 5, 6, 1};
		CodeGolf obj = new CodeGolf();
		Assert.assertEquals(false, obj.secuenciaCiclica(vector));
	}

}
