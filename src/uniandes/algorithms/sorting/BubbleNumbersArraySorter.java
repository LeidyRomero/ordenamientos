package uniandes.algorithms.sorting;

/**
 * Implements the bubble sort algorithm for number arrays
 */
public class BubbleNumbersArraySorter implements NumbersArraySorter {

	@Override
	public void sort(double[] numbers) {
		for(int i = numbers.length; i>0;i--)
		{
			for(int j = 0; j<i-1;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					double temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}

}
