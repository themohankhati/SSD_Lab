package lab_6;

import java.util.Scanner;

/*
 * @author mohan
 */
public class Driver {
	
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
		wc.addWord("mohan");
		wc.addWord("manoj");
		System.out.println(wc.wordMap);
		
//		wc.addSentence("This sentence has the word has in it twice");
//		wc.outputResults();

	}

}
