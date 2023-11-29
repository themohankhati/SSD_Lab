package exc_lab;

public class ArrayProcessor {

	//method to get the length of the array where Object[] a is array of objects
	int getArrayLength(Object[] a)
	{
		try
		{
			//initialize a counter to track the number of elements in the array.
			int count=0;
			
			//infinite loop to iterate through the array elements
			while(true) {
				
				//attempt to access the element at the current index
				Object t =a[count];
				
				//increment the counter to move to the next index
				count++;
		}
		}
		
		catch(Exception e)
		{
			//if a exception occurs, handle it here.
			System.out.println("error!");
		}
		
		//this line will never be reached due to the infinite loop, but it's necessary for compilation
		return 0;
	}
}
	
