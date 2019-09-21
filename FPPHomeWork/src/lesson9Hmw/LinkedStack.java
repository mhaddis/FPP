package lesson9Hmw;

class LinkedStack {

	class Node {
		private Node next;
		private Object data;

		public Node(Object item) {
			data = item;
		}
		
		@Override
			public String toString() {
				return current.data+"";
			}
		}

	Node top;
	int count = 0;
	Node current;

	public void push(Object item) // add an item on top of stack
	{
		current = new Node(item);
		current.next = top;
		top = current;
		count++;

		// System.out.println(current.data);
	}

	public Object pop() // remove an item from top of stack
	{
		if (isEmpty()) {
			return null;
		}
		Node temp = top;
		temp = top.next;
		count--;
		return temp;
	}

	public Object peek() // get top item of stack
	{
		if (isEmpty()) {
			return null;
		}
		return top;
	}

	public boolean isEmpty() // true if stack is empty
	{
		return (top == null);
	}

	public int size() // returns number of items in the stack
	{
		return count;
	}


	public static void main(String[] args) {
		LinkedStack stk = new LinkedStack(); // create stack of size 4
		Object item;
		
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push('D');

		System.out.println("Size of the stack is: " + stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
	}

}
