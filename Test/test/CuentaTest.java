package test;

import org.junit.Assert;
import org.junit.Test;

import main.CuentaBancaria;

public class CuentaTest {
	
	@Test
	public void testDepositar100()
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.depositar();
		Assert.assertEquals(100, c1.getSaldo());
	}

}
