package collections;

import java.util.Stack;

public class StackOpperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Revanth");
        stack.push("How are you");

        System.out.println(stack);
        String result=stack.pop();
        System.out.println(result);

        System.out.println(stack.peek());

        stack.push("satya");
        stack.push("sai");
        stack.push("surya");
        stack.removeElement("sai");

        System.out.println(stack.search("surya"));

    }
}
