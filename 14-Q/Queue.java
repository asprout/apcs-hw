import java.io.*;
import java.util.*;

public class Queue { 

    private Node head, tail;
    private int length;

    public Queue() {
	head = null;
	tail = null;
	length = 0;
    }

    public void enqueue(String s){
	Node n = new Node(s);
	if (length == 0){
	    head = n;
	    tail = n;
	} else {
	    tail.setNext(n);
	    tail = n;
	}
	length++;
    }

    public String dequeue(){
	String s;
	if (head == null){
	    return null;
	}
	s = head.getData();
	head = head.getNext();
	length--;
	if (head == null){
	    tail = null;
	}
	return s;
    }

    public String front(){
	return head.getData();
    }

    public int length(){
	return length;
    }

    public boolean isEmpty(){
	return head == null;
    }

    public String toString(){
	String s = "";
	Node temp = head;
        while (temp != null){
	    s = s + temp.getData() + ", ";
	    temp = temp.getNext();
	}
	return s;
    }
}    