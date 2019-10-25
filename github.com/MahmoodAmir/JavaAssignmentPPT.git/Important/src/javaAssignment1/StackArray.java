public class StackArray {
	int size;
	int arr[];
	int top;

	StackArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public int peek() {
		if (!this.isEmpty())
			return arr[top];
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackArray sa = new StackArray(10);
		sa.pop();
		System.out.println("=================");
		sa.push(10);
		sa.push(30);
		sa.push(50);
		sa.push(40);
		System.out.println("=================");
		sa.pop();
		sa.pop();
		sa.pop();
		System.out.println("=================");
	}
}
