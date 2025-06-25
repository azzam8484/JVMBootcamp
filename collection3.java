import java.util.Stack;

class SpecialStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    private int capacity;

    // Constructor
    public SpecialStack(int capacity) {
        this.capacity = capacity;
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        mainStack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        minStack.pop();
        return mainStack.pop();
    }

    // Get minimum in O(1)
    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }

    // Check if empty
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    // Check if full
    public boolean isFull() {
        return mainStack.size() == capacity;
    }

    // Peek (top element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return mainStack.peek();
    }

    public void printStack() {
        System.out.println("Current Stack: " + mainStack);
    }

}
public class collection3 {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack(5);

        s.push(10);
        s.push(20);
        s.push(5);
        s.push(8);
        s.push(2);

        s.printStack();
        System.out.println("Current Min: " + s.getMin());


        System.out.println("");
        System.out.println("After popping: " + s.pop() + ", Min: " + s.getMin());
        s.printStack();
        System.out.println("");

        System.out.println("After popping: " + s.pop() + ", Min: " + s.getMin());
        s.printStack();
        System.out.println("");

        s.push(1);
        System.out.println("After push(1) Min: " + s.getMin());
        s.printStack();

    }
}
