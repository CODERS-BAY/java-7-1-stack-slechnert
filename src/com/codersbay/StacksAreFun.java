package com.codersbay;


import java.util.List;
import java.util.Stack;

public class StacksAreFun {

    public static void main(String[] args) {
        List<Integer> stack = new Stack<>();
        push(stack, 1249);
        push(stack, 1);
        push(stack, 9);
        push(stack, 5238);
        push(stack, 15014354);
        System.out.println();

        output(stack);
        System.out.println();

        pop(stack);
        peek(stack);
        size(stack);
        push(stack, 44);
        push(stack, 332);
        pop(3, stack);
        size(stack);

        //OUTPUT ALTERED CONTENT
        System.out.println();
        System.out.println("---------------");
        output(stack);
    }

    public static void push(List stack, int value) {
        System.out.println(value + " has been added on top of the stack");
        stack.add(value);
    }

    public static int size(List stack) {
        System.out.println("Size is: " + stack.size());
        return (stack.size());
    }

    public static int pop(List stack) {
        int tmp = (int) stack.get(stack.size() - 1);
        System.out.println(tmp + "has been removed from the top of the stack");
        stack.remove(stack.size() - 1);
        return tmp;
    }

    public static int peek(List stack) {
        System.out.println("Value on top is: " + stack.get(stack.size() - 1));
        if ((stack.size() == 0)) {
            throw new IllegalArgumentException("Stack is already empty");
        } else {
            return (int) (stack.get(stack.size() - 1));
        }
    }

    public static int[] pop(int n, List stack) {
        if ((stack.size() == 0)) {
            throw new IllegalArgumentException("Stack is already empty");
        } else {

            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                pop(stack);
                temp[j] = pop(stack);
            }
            return temp;
        }
    }

    public static void output(List<Integer> stack) {
        System.out.println("Stack values are:");
        for (Integer value : stack) {
            System.out.println(value);
        }
    }
}
