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
//			System.out.println(srcStack.push(number));
	
		while(!srcStack.isEmpty())
		{
			Integer next=srcStack.pop();
//			System.out.println(next);
			//if destStack is not empty and the current element is greater than the top element of destStack
			while (!destStack.isEmpty() && ((ascending && destStack.peek()>next)))
			{
				
				//move the elements from destStack to srcStack until the correct position is found
				srcStack.push(destStack.pop());
			}
			
			destStack.push(next);		
		}
		//print the sorted destStack.
		System.out.println(destStack);
		

	}
}
