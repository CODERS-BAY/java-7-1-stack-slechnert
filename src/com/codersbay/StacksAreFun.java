package com.codersbay;


import java.util.List;
import java.util.Stack;

public class StacksAreFun {

    public static void main(String[] args) {
        List<Integer> stack = new Stack<>();
        IntStack IntStack = new IntStack(stack);
        IntStack.push(1249);
        IntStack.push(1);
        IntStack.push(9);
        IntStack.push(5238);
        IntStack.push(15014354);
        System.out.println();

        IntStack.output(stack);
        System.out.println();

        IntStack.pop(stack);
        IntStack.peek(stack);
        IntStack.size(stack);
        IntStack.push(44);
        IntStack.push(332);
        IntStack.pop(3, stack);
        IntStack.size(stack);

        //OUTPUT ALTERED CONTENT
        System.out.println();
        System.out.println("---------------");
        IntStack.output(stack);
    }

}
