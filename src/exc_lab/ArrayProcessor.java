package exc_lab;

/**
 * This is a class
 * @author Mr. Mohan&Manoj
 */
public class ArrayProcessor {

	/**
	 * 
	 * @param a array of objects given to the method getArrayLength
	 * @return returns the length of an array
	 */
	//method to get the length of the array where Object[] a is array of objects
	int getArrayLength(Object[] a)
	{
		try
		{
			//initialize a counter to track the number of elements in the array.
			int count=0;
			
			//iterate through the array element
			for(Object ignored:a )
			{
				//increment the counter to move on to next index
				count++;
		
			}
			
			//return the length, which represent the length of array.
			return count;
			
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
	
