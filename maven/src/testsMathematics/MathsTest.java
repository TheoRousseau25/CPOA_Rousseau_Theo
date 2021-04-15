package testsMathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {

	private IMaths maths;

	@Before
	public void setUp() {
		this.maths = new Maths();
	}

	@Test
	public void testAdditionCasGeneralNombresPositifs() {
		Assert.assertEquals(maths.addition(2, 3), 5);
	}
	
	@Test
	public void testAdditionCasGeneralNombresNegatifs() {
		Assert.assertEquals(maths.addition(-2, -3), -5);
	}
	
	@Test
	public void testAdditionCasGeneralNombresMixtes() {
		Assert.assertEquals(maths.addition(2, -3), -1);
	}
	
	
	@Test
	public void testSoustractionCasGeneralNombresPositifs() {
		Assert.assertEquals(maths.soustraction(2, 3), -1);
	}

	@Test
	public void testSoustractionCasGeneralNombreNegatifs() {
		Assert.assertEquals(maths.soustraction(-2, -3), 1);
	}
	
	@Test
	public void testSoustractionCasGeneralNombreMixtes() {
		Assert.assertEquals(maths.soustraction(-2, -3), 1);
	}
	
	@Test
	public void testMultiplicationCasGeneralNombresPositifs() {
		Assert.assertEquals(maths.multiplication(2, 3), 6);
	}
	
	@Test
	public void testMultiplicationCasGeneralNombresNegatifs() {
		Assert.assertEquals(maths.multiplication(-2, -3), 6);
	}
	
	@Test
	public void testMultiplicationCasGeneralNombresMixtes() {
		Assert.assertEquals(maths.multiplication(2, -3), -6);
	}

	@Test
	public void testDivisionCasGeneralNombresEntiersPositifs() throws MathsExceptions {
		Assert.assertEquals(maths.division(2, 3), 6);
	}
	
	@Test
	public void testDivisionCasGeneralNombresEntiersNegatifs() throws MathsExceptions {
		Assert.assertEquals(maths.division(-2, -3), 6);
	}
	
	@Test
	public void testDivisionCasGeneralNombresEntiersNegatifs() throws MathsExceptions {
		Assert.assertEquals(maths.division(2, -3), -6);
	}

	@Test
	public void testDivisionCasGeneralNombreDouble() throws MathsExceptions {

		Assert.assertEquals(maths.division(2, 3), 0.66, 2);
	}

	@Test(expected = MathsExceptions.class)
	public void testDivisionZeroS() throws MathsExceptions {
		try {
			maths.division(4, 0);
		} catch (MathsExceptions e) {
			Assert.assertEquals(e.getMessage(), "Division par zero impossible");
			throw e;
		}
	}

}


