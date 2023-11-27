package lab_5;

public class Driver {
	public static void main(String arg[])
	{
		NameManager manager= new NameManager();
		manager.addName("M.Mickleson");
		manager.addName("Johnua Taylor Bigss");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathan Smythton");
		manager.addName("P.Thompson");
		
		//should print all names
//		manager.printNames();
		
		//should remove names longer than 15
		System.out.println("---Names less than 15 character---");
		manager.removeLongNames();
		
		
//		manager.printNames(); //should now have longer names removed
		
		NumberSorter sorter= new NumberSorter();
		sorter.sort(new int []  {1,9,2,3,10,8,12,1, 99, 2, 43, 68, 109, 0}, false);
		sorter.sort(new int [] {1,2,3,4}, false);
		sorter.sort(new int [] {4,3,2,1}, false);
	}

}
