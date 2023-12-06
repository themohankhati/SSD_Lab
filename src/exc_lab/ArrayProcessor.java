package exc_lab;

/**
 * This is a class
 * @author Mr. Mohan&Manoj
 */
public class ArrayProcessor {

	/**
	 * method to get the length of the array 
	 * @param a array of objects given to the method getArrayLength
	 * @return returns the actual length of an array
	 */
	

	int getArrayLength(Object[] a)
	{
		try
		{
			//initialize a counter to track the number of elements in the array.
			int count=0;

			while(count<a.length)
			{
				Object t=a[count];
			    count++;
			}
			return count; // return is mandatory.
		}
		
		catch(Exception e)
		{
			//if a exception occurs, handle it here.
			System.out.printf("An error occurred: " ,e.getMessage());

		}
		
		//this line will never be reached due to the infinite loop, but it's necessary for compilation
		return 0;
	}
}
	
