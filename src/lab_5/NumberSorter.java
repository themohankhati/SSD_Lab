package lab_5;

import java.util.Stack;

public class NumberSorter {
	void sort (int [] numbers, boolean ascending)
	{
		//The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		//The dest  stack, to which the numbers are pushed
		Stack<Integer> destStack=new Stack<Integer>();
		
		//Add the initial array of numbers to the source stack
		for (int number: numbers)
			srcStack.push(number);
			
		//if srcStack size is greater than 0.
			while(srcStack.size()>0)
			{
				Integer next = srcStack.pop();
				
				if(destStack.size()>0)
				{
					srcStack.push(destStack.pop());
				}
				
				else
				{
					destStack.push(next);
				}
			}
		
		
	}

}
