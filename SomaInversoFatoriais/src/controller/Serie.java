package controller;

public class Serie
{
	public Serie()
	{
		super();
	}

	/*
	PONTO DE PARADA -> O resultado de 1 sobre 1! é igual a 1.

	RELAÇÃO DE PASSOS -> O resultado da série para um termo é igual ao resultado
		da série pro número anterior somado ao inverso do fatorial desse número
		(1 / n!).
	*/

	public double serieHarmonica(int n)
	{
		if (n == 1)
			return 1; // -> 1 / 1! =  1 / 1 = 1
		return serieHarmonica(n - 1) + (1 / (double)fatorial(n));
	}

	public int fatorial(int n)
	{
		if (n == 1)
			return 1;
		return n * fatorial(n - 1);
	}
}