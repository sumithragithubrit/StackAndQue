package com.stackandque;

public class MyStack<T> {
	
	Node<T> head;
    Node<T> tail;
//append method
    public void append(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }
    
    //to display method
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

    //pop method
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


    public void peak(){
        if ( head != null){
            System.out.println("Top most element is "+ head.key);
        }else {
            System.out.println("No element present in list");
        }
    }
}
