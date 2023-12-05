package lab_6;

import java.util.Scanner;

/**
 * This is a main class.
 * @author Mr. Mohan&Manoj
 */
public class Driver {
	
	/**
	 * When we run a java program, the Java Virtual Machine(JVM) looks for the main method in the specified class and starts the execution from there.
	 * (String args[] parameter list that allows you to pass command-line arguments to your java program.
	 * @param args parameter is an array of strings, where each element represents a command-line argument passed to the program when it is executed 
	 */
	public static void main(String args[])
	{
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the email address!! ");
//		String emails=scanner.nextLine();
		
		EmailStore email=new EmailStore();
		email.addEmail("mohankc596@gmail.com");
		email.addEmail("mohankc596@gmail.com");
		email.addEmail("mohankc596@gmail.com");
		email.addEmail("mohan596@gmail.com");

//		email.hasEmail(emails);
		email.displayEmails();
		
//		
		WordCounter wc=new WordCounter();
//		wc.addWord("mohan");
//		wc.addWord("manoj");
//		System.out.println(wc.wordMap);
		
		wc.addSentence("This has sentence has the word has in it twice");
		wc.outputResults();

	}

}
