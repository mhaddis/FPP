package lesson8Hmw2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node (null,null,null);
	}

	public void addSort(String item) 
		{
			if (header.next == null) {
				Node temp = new Node(header, item, null);
				header.next = temp;
				return;
			}

			Node previous = null;
			Node current = header;
			Node newNode = null;

			while (current.next != null && item.compareTo(current.next.value) > 0) {
				previous = current;
				current = current.next;
			}
			newNode = new Node(current, item, current.next);
			if (current.next != null) 		
				current.next.previous = newNode;
				current.next = newNode;

	}

	public int size() {
		int count = 0;
		Node temp= header;
		if (temp.next != null) {
			
			while (temp.next != null) {
				count++;
				temp = temp.next;
			}
		}
		return count;
	}

	public boolean isEmpty() {
		return header.next == null;
	}

	public Node getFirst() {
		return header.next;
	}

	public Node getLast() {
		if (header.next == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				{temp = temp.next;}

			return temp;
		}

	}

	public void removeFirst() {
		if (header.next == null) {
			System.out.println("List is Empty can not delete.");
		}
		else if (getFirst().next == null) 
		{
			header.next.next = null;
			header.next = null;
		}
		else {
			Node first = getFirst();
			first.next.previous=header;
			header.next=first.next;
			first = null;			
		}
	}

	void removeLast() {
		if (header.next == null)
			System.out.println("List is Empty can not delete.");
		else {
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.previous.next = null;
			temp = null;
		}
	}

	public void print() {
		print(getFirst());
	}

	private void print(Node n) {
		if (n == null)
			return;
		else {
			System.out.println(n.value);
			print(n.next);
		}
	}

	public String toString() {
		StringBuilder str = new StringBuilder("");
		Node temp = header;
		while (temp.next != null) {
			str.append("-->[" + temp.next.value.toString() + "]");
			temp = temp.next;
		}
		str.append("-->[" + "NULL" + "]");
		return str.toString();
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();

		mySL.addSort("Merry");
		mySL.addSort("Hiwi");
		mySL.addSort("Beza");
		mySL.addSort("Blen");
		mySL.addSort("Sami");
		mySL.addSort("Sura");

		System.out.println("Header is: " + mySL.header);
		System.out.println("Header next is: " + mySL.header.next);
		System.out.println("Header pre is: " + mySL.header.previous);
		System.out.println("My Orignal list is: " + mySL);
		System.out.println("Print list using Recursive");
		mySL.print();
		System.out.println("My list size is: " + mySL.size());
		System.out.println("Checking if the list is empty...... " + mySL.isEmpty());
		System.out.println("The 1st node of the list is: " + mySL.getFirst());
		System.out.println("The last node of the list is: " + mySL.getLast());
		mySL.removeLast();
		System.out.println("Removed the last node from the list: " + mySL);
		mySL.removeFirst();
		System.out.println("Removed the first node from the list: " + mySL);

	}
}
