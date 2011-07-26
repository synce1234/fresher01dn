/**
 * Assignment 1: Stack
 * Objective: 
 * Problem Description: 
 * Create the MyStack class with following info:
 * •   Properties
 * o   stackValues, contain value of the stack
 * •   Methods
 * o   push(): Push a value to the stack
 * o   pop(): Pop a value out from the stack
 * o   get(): Get a value from the stack

 */
package assigment.pk01stack;

public class MyStack {
    public static final int STACK_CAPACITY = 100;

    public int[] stackValue = new int[STACK_CAPACITY];
    public int size = 0;

    public void push(int anyInt) {
        stackValue[size] = anyInt;
        size++;
    }

    public int pop() {
        return stackValue[--size];
    }

    public MyStack() {

    }

    

}
