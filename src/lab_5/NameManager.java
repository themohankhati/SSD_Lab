package lab_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {
	
	List<String> names= new ArrayList<String>();
	
	public void addName(String name)
	{
		names.add(name);
		
	}
	
	public void printNames()
	{
		for (String i:names)
		{
			System.out.println(i);
		}
	}
	
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
