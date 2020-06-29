package com.codersbay;

import java.util.List;

public class IntStack {
    public List<Integer> stack;

    public IntStack(List<Integer> stack) {
        this.stack = stack;
    }

    public void push(int value) {
        System.out.println(value + " has been added on top of the stack");
        stack.add(value);
    }

    public int size(List stack) {
        System.out.println("Size is: " + stack.size());
        return (stack.size());
    }

    public int pop(List stack) {
        int tmp = (int) stack.get(stack.size() - 1);
        System.out.println(tmp + " has been removed from the top of the stack");
        stack.remove(stack.size() - 1);
        return tmp;
    }

    public int peek(List stack) {
        System.out.println("Value on top is: " + stack.get(stack.size() - 1));
        if ((stack.size() == 0)) {
            throw new IllegalArgumentException("Stack is already empty");
        } else {
            return (int) (stack.get(stack.size() - 1));
        }
    }

    public int[] pop(int n, List stack) {
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

    public void output(List<Integer> stack) {
        System.out.println("Stack values are: ");
        for (Integer value : stack) {
            System.out.println(value);
        }
    }
}
