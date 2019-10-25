public class QueueArray {

	private int capacity;
	int arr[];
	int front;
	int rear;
	int currentSize = 0;

	public QueueArray(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		arr = new int[this.capacity];
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full...!! Can't add more elements");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			arr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue");
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty...!! Can't dequeue element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(arr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(arr[front - 1] + " removed from the queue");
			}
			currentSize--;
		}
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {

		if (currentSize == 0) {
			return true;
		}
		return false;
	}

	public static void main(String a[]) {

		QueueArray queue = new QueueArray(5);
		queue.enqueue(6);
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(15);
		queue.enqueue(31);
		queue.dequeue();
		queue.enqueue(19);
		queue.dequeue();
		queue.enqueue(00);
		queue.enqueue(42);
		queue.dequeue();
		queue.enqueue(1);
		queue.enqueue(2);
	}
}