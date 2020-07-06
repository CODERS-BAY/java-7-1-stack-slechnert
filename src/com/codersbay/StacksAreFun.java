package com.codersbay;


import java.util.List;
import java.util.Stack;

public class StacksAreFun {

    public static void main(String[] args) {
        List<Integer> stack = new Stack<>();
        IntStack intStack = new IntStack(stack);
        intStack.push(1249);
        intStack.push(1);
        intStack.push(9);
        intStack.push(5238);
        intStack.push(15014354);
        System.out.println();

        intStack.output(stack);
        System.out.println();

        intStack.pop();
        intStack.peek();
        intStack.size();
        intStack.push(44);
        intStack.push(332);
        intStack.pop(3);
        intStack.size();

        //OUTPUT ALTERED CONTENT
        System.out.println();
        System.out.println("---------------");
        intStack.output(stack);
    }

}
