package lesson9Hmw;

public class MainArrayQueueImpl {

	public static void main(String[] args) {
		ArrayQueueImpl test = new ArrayQueueImpl();

		System.out.println("The top element is: " + test.peek());
		System.out.println("Is the Queue empty? " + test.isEmpty());
		for (int i = 6; i < 12; i++)
			test.enqueue(i);
		System.out.println("The size of the Queue after enqueue is: " + test.size());
		System.out.println("The top element is: " + test.peek());
		System.out.println("Is the Queue empty? " + test.isEmpty());
		for (int i = 6; i < 12; i++)
			test.dequeue();
		test.isEmpty();
		System.out.println("The size of the Queue after enqueue is: " + test.size());
	}
}