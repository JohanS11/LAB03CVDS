package edu.eci.cvds.tdd.aerodescuentos;


import org.junit.Assert;
import org.junit.Test;


public class TarifasTest {

	@Test
	public void Caso1() {
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(10000, 14, 17)==9500.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(1500, 1, 1)==1425.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(5000, 8, 10)==4750.0);
	}
	@Test
	public void Caso2() {
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(10000, 15, 30)==10000.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(1500, 20, 18)==1500.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(5000, 8, 65)==5000.0);
	}
	@Test
	public void Caso3() {
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(10000, 14, 66)==9200.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(1500, 3, 90)==1380.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(5000, 8, 67)==4600.0);
	}
	@Test
	public void Caso4() {
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(10000, 21, 17)==8000.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(1500, 35, 7)==1200.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(5000, 60, 10)==4000.0);
	}
	@Test
	public void Caso5() {
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(10000, 21, 18)==8500.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(1500, 22, 25)==1275.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(5000, 30, 65)==4250.0);
	}
	@Test
	public void Caso6() {
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(10000, 21, 66)==7700.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(1500, 22, 67)==1155.0);
		Assert.assertTrue(CalculadorDescuentos.calculoTarifa(5000, 30, 90)==3850.0);
	}

}
