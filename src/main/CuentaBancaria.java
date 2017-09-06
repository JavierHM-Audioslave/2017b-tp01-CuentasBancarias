package main;

public class CuentaBancaria {
	
	private Integer saldo = 0;
	private boolean activa = true;
	
	public void depositar(Integer monto)
	{
		saldo+=monto;
	}
	
	public Integer getSaldo()
	{
		return saldo;
	}
	
	public boolean extraer(Integer monto)
	{
		if(saldo>=monto && monto<1000000)
		{
			saldo -= monto;
			return true;
		}
		return false;
	}
	
	public boolean transferirMontoHacia(Integer monto, CuentaBancaria c2)
	{		
		if(saldo>=monto && activa == true && c2.esActiva() == true)
		{
			saldo -= monto;
			c2.depositar(monto);
			return true;
		}
		return false;
	}
	
	public boolean esActiva()
	{
		return activa;
	}
}
