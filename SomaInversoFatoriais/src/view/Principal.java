package view;

import controller.Serie;
import controller.ValidaEntrada;

public class Principal
{
	public static void main(String[] args)
	{
		int n;
		double resultado;
		Serie s = new Serie();
		ValidaEntrada ve = new ValidaEntrada();

		n = ve.numeroValido("Digite um número: ");
		resultado = s.serieHarmonica(n);
		System.out.println("O resultado da série é: " + resultado);
	}
}