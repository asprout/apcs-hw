import java.io.*;
import java.util.*;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList(){
	head = new Node("");
    }
    
    public void add(String s){
	Node n = new Node(s);
	Node tmp = head;
	for (int i = 0; i < size; i++){
	    tmp = tmp.getNext();
	}
	tmp.setNext(n);
	size++;
    }
    public String toString(){
	String s = "";
	Node temp = head;
	while (temp != null){
	    s += temp.getData()+ " ";
	    temp = temp.getNext();
	}
	return s;
    }
    public void add(int i, String s){
	if (i==0){
	    add(s);
	}
	else {
	    Node temp = head;
	    for (int x = 0; x < i - 1; x++){
		temp = temp.getNext();
	    }
	    Node n = new Node(s);
	    n.setNext(temp.getNext());
	    temp.setNext(n);
	}
	size++;
    }
    public String get(int i){
	Node temp = head;
	for (int c = 0; c<i; c++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }
    public String remove(int i){
	Node temp = head;
	for (int x = 0; x < i; x++ ){
	    temp = temp.getNext();
	}
	Node tmp = temp.getNext();
	temp.setNext(tmp.getNext().getNext());
	size--;
	return temp.getData();
    }
    public int find(String s){
	Node temp = head;
	int i = 0;
	while (temp != null){
	    if (temp.getData().equals(s)){
		return i;
	    }
	    temp = temp.getNext();
	    i++;
	}
	return -1;
    }

    public String set(int i, String s){
	Node temp = head;
	String ret ="";
	for (int ind = 0; ind < i-2; ind++){
	    temp = temp.getNext();
	}
	Node newN=new Node(s);
	Node old=temp.getNext();
	newN.setNext(old.getNext());
	temp.setNext(newN);
	if (i==0){
	    head=newN;
	}
	return old.getData();
    }
    public int length(){
        return size;
    }

}