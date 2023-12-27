package Learning.DataStructure.Stack;

public class Stack_1 {
    // A basic stack operation without collection framework build in method
    int MAX = 1000;
    int[] stack = new int[MAX];
    int top;

    public Stack_1() {
        this.top = -1;
    }

    public void push(int item) {
        if (top >= MAX-1) {
            System.out.println("Stack is overflow");
        } else {
            top++;
            this.stack[top] = item;
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack is underflow");
        } else {
            top--;
        }
    }

    public void peek() {
        if (top < 0) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("The peek item: [ " + stack[top] + " ]");
        }
    }

    void showItems() {
        System.out.print("Item list from the stack: [");
        for (int i = top; i > -1; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println("]");
    }


    // Main method
    public static void main(String[] args) {
        Stack_1 obj = new Stack_1();
        obj.push(10);
        obj.push(20);
        obj.push(100);
        obj.push(200);
        obj.pop();
        obj.showItems();
        obj.peek();
    }
}
