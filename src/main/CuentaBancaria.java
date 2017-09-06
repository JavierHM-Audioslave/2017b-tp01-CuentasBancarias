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
	
	public void extraer(Integer monto)
	{
		saldo -= monto;
	}
	

}
