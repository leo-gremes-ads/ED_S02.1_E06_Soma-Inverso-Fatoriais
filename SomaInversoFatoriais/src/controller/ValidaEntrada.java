package controller;

import java.util.Scanner;

public class ValidaEntrada
{
	public ValidaEntrada()
	{
		super();
	}

	public int numeroValido(String msg)
	{
		int n;
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.print("Digite um número: ");
			try {
				n = s.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
				s.next();
				continue;
			}
			if (n > 0)
				break;
			System.out.println("O número deve ser maior ou igual a 1.");
		}
		s.close();
		return n;
	}
}