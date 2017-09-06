package test;

import org.junit.Assert;
import org.junit.Test;

import main.CuentaBancaria;

public class CuentaTest {
	
	@Test
	public void testDepositar100()
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.depositar(100);
		Assert.assertEquals(100, (int)c1.getSaldo());
	}
	
	@Test
	public void testExtraer100()
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.extraer(100);
		Assert.assertEquals(0, (int)c1.getSaldo());
	}
	
	@Test
	public void testExtraer1000000() // Aún teniendo suficiente saldo, en una misma operacion no se puede extraer $1000000.
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.depositar(1000001);
		Assert.assertFalse(c1.extraer(1000000));		
	}

}
