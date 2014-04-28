import java.io.*;
import java.util.*;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public Iterator<E> iterator() {
	//make and return iterator for this llist
	Iterator<e> it = new myIterator<E>(head);
	return it;
    }

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
	Node c = head;
	for (int ind=0; ind < i; ind++) {
	    c = c.getNext();
	}
	temp.setNext(c.getNext());
	c.setNext(temp);
	size++;
    }

    public String get(int i) {
	Node c = head.getNext();
	if (i < 0) {
	    return null;
	}
	for (int index=0; index < i; index++) {
	    c = c.getNext();
	}
	return c.getData();
    }

    public String set(int i, String s) {
	Node temp = new Node(s);
	Node c = head;
	for (int index = 0; index < i ; index++) {
	    c = c.getNext();
	}
	temp.setNext(c.getNext().getNext());
	Node replaced = c.getNext();
	c.setNext(temp);
	return replaced.getData();
    }

    public String remove(int i) {
	Node c = head;
	for (int index=0; index<i; index++) {
	    c = c.getNext();
	}
	Node temp = c.getNext();
	c.setNext(c.getNext().getNext());
	size--;
	return temp.getData();
    }

    public int find(String s) {
	Node c = head;
	for (int i=0; i<length(); i++) {
	    if (c.getData() == s) {
		return i-1;
	    }
	    c = c.getNext();
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