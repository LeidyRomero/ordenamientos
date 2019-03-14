package uniandes.algorithms.sorting;

/**
 * Implements the merge sort algorithm for number arrays
 */
public class MergeNumbersArraySorter implements NumbersArraySorter {

	@Override
	public void sort(double[] numbers) {
		double[] aux = new double[numbers.length];
		mergeSort(numbers, aux, 0, numbers.length - 1);
	}

	private static void mergeSort(double[] datos, double[] aux, int primerIndex, int ultimoIndex)
	{
		if (ultimoIndex <= primerIndex)
			return;

		int mitad = primerIndex + (ultimoIndex - primerIndex) / 2;

		mergeSort(datos, aux, primerIndex, mitad);//Primera particion
		mergeSort(datos, aux, mitad+1, ultimoIndex);//Segunda particion
		//reordenar:
		merge(datos, aux, primerIndex, mitad, ultimoIndex);
	} 
	private static void merge(double[] datos, double[] aux, int primerIndex, int mitad, int ultimoIndex)
	{
		for (int k = primerIndex; k <= ultimoIndex; k++)
		{
			aux[k] = datos[k];
		}

		int i = primerIndex;
		int j = mitad+1;

		for (int k = primerIndex; k <= ultimoIndex; k++)
		{
			if (i > mitad) 
			{
				datos[k] = aux[j++];
			}
			else if (j > ultimoIndex) 
			{
				datos[k] = aux[i++];
			}
			else if (aux[j]>aux[i]) 
			{
				datos[k] = aux[j++];
			}
			else 
			{
				datos[k] = aux[i++];
			}
		}
	} 
}
