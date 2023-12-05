package lab_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This is a class.
 * @author Mr. Mohan&Manoj
 */
public class NameManager {
	
	List<String> names= new ArrayList<String>();
	
	
	/**
	 * This is a add method.
	 * @param name The name to be added which can't be null.
	 */
	public void addName(String name)
	{
		names.add(name);
		
	}
	
	/**
	 * This is a method for displaying names.
	 */
	public void printNames()
	{
		for (String i:names)
		{
			System.out.println(i);
		}
	}
	
	/**
	 * This is a another way to print names using Iterator.
	 */
	public void removeLongNames()
	{
		//Traverse the 'names' list using an explicit iterator
		Iterator<String> iter=names.iterator();
		while(iter.hasNext())
		{
			String name=iter.next();
			if(name.length()<=15)
			{
				System.out.println(name);
			}
		}
		
	}

}
