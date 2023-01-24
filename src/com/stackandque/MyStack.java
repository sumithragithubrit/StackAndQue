package com.stackandque;

public class MyStack<T> {
	
	Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.key);
            } else {
                System.out.print(temp.key + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    
    //pop operation using pop method
    public void pop() {
        if (head == null) {
            System.out.println("List is empty");

        } else {

            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }

    }
    // peak method
    public void peak() {
        if ( head != null){
            System.out.println("Top most element is "+ head.key);
        }else {
            System.out.println("No element present in list");
        }
    }

}
