package Learning.DataStructure.Stack;

import java.util.Stack;

public class Stack_2 {
    Stack<Integer> stack = new Stack<>();

    public void operation() {
        this.stack.push(10);
        this.stack.push(20);
        this.stack.push(100);
        this.stack.push(200);
        this.stack.pop();
    }

    public void showItems() {
        System.out.println("Item list from the stack: " + stack);
        System.out.println("The peek item: [" + this.stack.peek() + "]");
    }

    public static void main(String[] args) {
        Stack_2 obj = new Stack_2();
        obj.operation();
        obj.showItems();
    }
}
