package num87;

import java.util.Scanner;

public class Num87
{
	
	public static void main(String[] args)
	{
		int numero;	
		int max = 0;	
		int contadorMax = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.print("Introduce número (necesarios 87 numeros para finalizar el pograma): ");
			numero= sc.nextInt();
			if(numero > max)
			{
				max = numero;
				contadorMax = 1;
			}
			else if(numero == max)
			{
				contadorMax++;
			}	
		}
		sc.close();
		System.out.println("El número máximo ha sido " + max + " y se  ha repetido " + contadorMax + " veces.");
	}
}
