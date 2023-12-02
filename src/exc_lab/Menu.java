package exc_lab;

/**
 * This is a class
 * @author Mr. Mohan&Manoj
 */
public class Menu {
	
	/**
	 * 
	 * @param opt integer input given to the displayMenuOption method
	 * @throws InvalidOptionException
	 */
	void displayMenuOption(int opt) throws InvalidOptionException {
		
		if (opt<1 && opt>3)
			throw new InvalidOptionException();
			System.out.println("Please select the number between 1 and 3.");
		
		if (opt==1)
		{
			System.out.println("Menu option 1 selected");		
		}
		
		else if (opt==2)
		{
			System.out.println("Menu option 2 selected");
		}
		
		else if(opt==3)
		{
			System.out.println("Menu option 3 selected");
		}
	}

}
