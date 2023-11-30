package exc_lab;

public class Driver {
	public static void main(String agrs[])
	{
		ArrayProcessor ap=new ArrayProcessor();
		int len=ap.getArrayLength(new String[] {"one", "two", "threee"});
		
		System.out.println("Array length is " +len);
	}

}
