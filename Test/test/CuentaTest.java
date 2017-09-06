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

}
