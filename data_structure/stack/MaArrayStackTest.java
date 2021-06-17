package stack;

public class MaArrayStackTest {
	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30); 
		stack.push(40);
		
		stack.printAll();
				
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		MyArrayStack stack2 = new MyArrayStack(5);
		stack.push(0);
		
		stack2.printAll();
		
	}
}
