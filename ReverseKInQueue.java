package linkedListProblems;

import dataStructure.Stacks;

public class ReverseKInQueue {

	public static void main(String[] args) throws Exception {
		Queues a = new Queues();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		
		//a.print();
		int k = 3;
		//3,2,1,4,5
		int i =0, size = a.GetSize();
		Stacks s = new Stacks(size+1);
		
		//System.out.println("SIZE "+size);
		while(i<k)
		{
			s.push(a.dequeue());
			++i;
		}
		//System.out.println("Stack ");
		//s.print();
			
		while(!s.isEmpty())
		{
			a.enqueue(s.pop());
		}
		
		i=0;
		while (i<size-k)
		{
			++i;
			a.enqueue(a.dequeue());
		}
		
		a.print();
	}
}
