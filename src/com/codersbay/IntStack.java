package com.codersbay;

import java.util.List;

public class IntStack {
    public List<Integer> STACK;

    public IntStack(List<Integer> STACK) {
        this.STACK = STACK;
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
        System.out.println(tmp + " has been removed from the top of the stack");
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
        System.out.println("Stack values are: ");
        for (Integer value : stack) {
            System.out.println(value);
        }
    }
}
