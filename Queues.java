package linkedListProblems;

public class Queues {
	LinkedListNode front=null;
	LinkedListNode rear = null;
	int size =0;
	
	public void enqueue(int data)
	{
		if(front == null)
		{
			front = new LinkedListNode(data, null);
			rear = front;
		}
		else
		{
			LinkedListNode newNode = new LinkedListNode(data,null);
			rear.next = newNode;
			rear = newNode;
		}
		++size;
	}
	
	public int GetSize()
	{
		return size;
	}
	
	public int dequeue() {
		int val;
		if(front == null)
		{
			return 0;
		}

		--size;
		if(rear==front)
		{
			val = front.value;
			front = rear= null;
			return val;
		}
		else
		{
			val = front.value;
			front = front.next;
			return val;
		}
	}
	
	public void print()
	{
		LinkedListNode c= front;
		while(c!=null)
		{
			System.out.println(c.value+"->");
			c= c.next;
		}
	}
}
