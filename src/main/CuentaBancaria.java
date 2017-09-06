package main;

public class CuentaBancaria {
	
	private Integer saldo = 0;
	
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
}
