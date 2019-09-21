package lesson9Hmw;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {

		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return 0;
			}
		return arr[front];
	}

	public void enqueue(int obj) {
		if (front == -1)
			front++;
		if (rear == arr.length)
			resize();
		arr[rear++] = obj;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Is Empty");
			return -1;
		}
		int removedNum = arr[front];
		front++;
		return removedNum;
	}

	public boolean isEmpty() {
		return (front == -1 || rear == 0);
	}

	public int size() {
		if (isEmpty())
			return 0;
		return rear - front;
	}

	private void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

}