package sortArray;


public class SortArray
{
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		/** 
		 * This is a program to sort an array 
		 * so that they're in order from smallest to largest (ascending order). 
		 * 
		 * @author Grace
		 * 
		 **/
		
		//Initialize an array
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		/*
		 */
		
		for (int counter=0; counter < arr.length ; counter++)
		{
			for (int inner=0; inner<arr.length -1 ; inner++ )
			{
				if ( arr[inner] > arr[inner+1])
				{
					// swap the values in two slots
					int store = 0; 
					store = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = store;
					
				}
			}
		}

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}