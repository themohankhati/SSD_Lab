package exc_lab;

/**
 * This is a class
 * @author Mr. Mohan&Manoj
 */
public class Driver extends ArrayProcessor {
	
	/**
	 * when run a java program, the Java Virtual Machine(JVM) looks for the main method in the specified class and starts the execution from there.
	 * (String args[] parameter list that allows you to pass command-line arguments to your java program.
	 * @param agrs parameter is an array of strings, where each element represents a command-line argument passed to the program when it is executed
	 * Note for Command-line arguments: for example, java HelloWorld arg1, arg2 would be an array containing [args1, arg2]
	 * @throws InvalidOptionException throws the error.
	 */
	public static void main(String agrs[]) throws InvalidOptionException
	{
		try
		{
			
		
		ArrayProcessor ap=new ArrayProcessor();
		int len=ap.getArrayLength(new String[] {"one", "two", "three"});
		
		System.out.println("Array length is " +len+'.');
		
		Menu menu=new Menu();
		menu.displayMenuOption(2);
		}
		
		catch(Exception e)
		{
			System.out.println("Error");

		}
}}
