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
	public void testExtraer1000000() // A�n teniendo suficiente saldo, en una misma operacion no se puede extraer $1000000.
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.depositar(1000001);
		Assert.assertFalse(c1.extraer(1000000));		
	}
	
	@Test
	public void testExtraer1000001() // A�n teniendo suficiente saldo, en una misma operacion no se puede extraer $1000001.
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.depositar(1000002);
		Assert.assertFalse(c1.extraer(1000001));		
	}
	
	@Test
	public void testExtraer1000002() // A�n teniendo suficiente saldo, en una misma operacion no se puede extraer $1000002.
	{
		CuentaBancaria c1 = new CuentaBancaria();
		c1.depositar(1000003);
		Assert.assertFalse(c1.extraer(1000002));		
	}
	
	@Test
	public void testTransferir$100AOtraCuentaDesdeUnaCuentaVacia()
	{
		CuentaBancaria c1 = new CuentaBancaria();
		CuentaBancaria c2 = new CuentaBancaria();		
		Assert.assertFalse(c1.transferirMontoHacia(100, c2));
		Assert.assertEquals(0, (int)c2.getSaldo());
	}

}
