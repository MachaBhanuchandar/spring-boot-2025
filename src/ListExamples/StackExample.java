package ListExamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
//        pushing elements
        stack1.push(24);
        stack1.push(29);
        stack1.push(26);
        stack1.push(2);
        stack1.push(4);
        System.out.println("stack1 :"+stack1);
//delete lifo
        stack1.pop();
        System.out.println("stack1 :"+stack1);

    }
}
