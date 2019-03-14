package uniandes.algorithms.sorting;

/**
 * Implements the quick sort algorithm for number arrays
 */
public class QuickNumbersArraySorter implements NumbersArraySorter {

	@Override
	public void sort(double[] numbers) {
		shuffle(numbers);
		quickSort(numbers, 0, numbers.length - 1); 
	}
	public static void shuffle(double[] datos)
	{
		for(int i=0; i<datos.length; i++)
		{
			int randominer=(int) (datos.length*Math.random());
			double uno= datos[i];
			double cambio= datos[randominer];
			datos[i]=cambio;
			datos[randominer]=uno;
		}
	}
	private static void quickSort(double[] datos, int primerIndex, int ultimoIndex)
	{
		if (ultimoIndex <= primerIndex)
		{
			return;
		}

		int j = particion(datos, primerIndex, ultimoIndex);

		quickSort(datos, primerIndex, j-1);

		quickSort(datos, j+1, ultimoIndex);
	} 
	private static int particion(double[] datos, int primerIndex, int ultimoIndex)
	{
		int i = primerIndex; 
		int j = ultimoIndex+1;
		
		while (true)
		{
			while (datos[++i]>datos[primerIndex])
			{
				if (i == ultimoIndex)
				{
					break;
				}
			}

			while (datos[primerIndex]>datos[--j])
			{
				if (j == primerIndex)
				{
					break;
				}
			}

			if (i >= j)
			{
				break;
			}
			
			exchange(datos, i, j);
		}
		
		exchange(datos, primerIndex, j);
		return j;
	} 
	private static void exchange( double[] datos, int i, int j)
	{
		double rev=datos[i];
		datos[i]=datos[j];
		datos[j]=rev;

	}
}
