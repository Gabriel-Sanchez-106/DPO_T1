package uniandes.dpoo.taller0.modificacion;
import java.util.*;
import uniandes.dpoo.taller0.procesamiento.*;

public class Modificacion 
{
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!") ;
		try
		{
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("data/atletas.csv") ;
			Set<String> paises = new HashSet <>(calc.paisConMasMedallistas().keySet());
			
			if (paises.size() == 1)
			{
			System.out.println("El país más medallista es: "+ paises);
			}
			else
			{
				System.out.println("Los países más medallistas son: "+ paises);
			}
		}
		catch (Exception e)
		{
		 System.out.println("Unexpected");
		}
	}
}
