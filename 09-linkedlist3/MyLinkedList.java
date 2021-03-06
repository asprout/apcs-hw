import java.io.*;
import java.util.*;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
	head = new Node("");
	tail = head;
    }

    public void add(String s) {
	Node n = new Node(s);
	tail.setNext(n);
	tail = n;
	size++;
    }

    public void add(int i, String s) {
	Node temp = new Node(s);
	Node current = head;
	for (int ind=0; ind < i; ind++) {
	    current = current.getNext();
	}
	temp.setNext(current.getNext());
	current.setNext(temp);
	size++;
    }

    public String get(int i) {
	Node current = head.getNext();
	if (i < 0) {
	    return null;
	}
	for (int index=0; index < i; index++) {
	    current = current.getNext();
	}
	return current.getData();
    }

    public String set(int i, String s) {
	Node temp = new Node(s);
	Node current = head;
	for (int index = 0; index < i ; index++) {
	    current = current.getNext();
	}
	temp.setNext(current.getNext().getNext());
	Node replaced = current.getNext();
	current.setNext(temp);
	return replaced.getData();
    }

    public String remove(int i) {
	Node current = head;
	for (int index=0; index<i; index++) {
	    current = current.getNext();
	}
	Node temp = current.getNext();
	current.setNext(current.getNext().getNext());
	size--;
	return temp.getData();
    }

    public int find(String s) {
	Node current = head;
	for (int i=0; i<length(); i++) {
	    if (current.getData() == s) {
		return i-1;
	    }
	    current = current.getNext();
	}
	return -1;
    }

    public int length() {
	return size;
    }


    public String toString() {
	String s = "";
	Node temp = head;
	while (temp.getNext() != null) {
	    s = s + temp.getNext().getData();
	    temp = temp.getNext();
	}
	return s;
    }
}