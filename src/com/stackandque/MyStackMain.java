package com.stackandque;

public class MyStackMain {

	public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.append(70);
        myStack.append(30);
        myStack.append(56);
        myStack.display();
        
        while (myStack.head != null) {
            myStack.pop();
            System.out.println("Updated List: ");
            myStack.display();
        }
	}
}
