package taskfour;
public class IntegerStack {
    private static final int MAX_SIZE = 100; 
    private int[] stackArray;
    private int top;

    public IntegerStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Error: Stack overflow. Cannot push element onto a full stack.");
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element onto the stack: " + element);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Error: Stack underflow. Cannot pop element from an empty stack.");
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element from the stack: " + poppedElement);
        }
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.pop();
    }
}
