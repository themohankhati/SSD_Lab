package lab_6;

import java.util.*;
import java.util.stream.Stream;

/*
 * EmailStore class 
 * @author mohan
 */
public class EmailStore {
	Set<String> emailAddress=new HashSet<String>();
	
	/*
	 * 
	 */
	//method to add email address to the set
	public boolean addEmail(String email)
	{
		boolean isEmailAdded=emailAddress.add(email);
		return isEmailAdded;	
	}
	
	//method to check if the email address exists in the set
	public boolean hasEmail(String email)
	{
		return emailAddress.contains(email);
	}
	
	//displaying email stored in set
	public void displayEmails()
	{
		emailAddress.stream().forEach(System.out::println);
	}
	
	
}
