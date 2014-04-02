import java.io.*;
import java.util.*;

public class myLinkedList<E> implements Iterable<E>{

    private Node<E> head;
    private Node<E> tail;

    public Iterator<E> iterator() {
	return new myLLIterator<E>(head.getNext());
    }

    public myLinkedList() {
	head = new Node<E>(null);
	tail = head;
    }
    
    public void add(E d) {
	Node<E> tmp = new Node<E>(d);
	if (length() < 1){
	    head.setNext(tmp);
	}
	tail.setNext(tmp);
	tail=tmp;

    }

    public void add(int ind, E s){
	Node<E> tmp = new Node<E>(s);
	Node nod = head;
	for (int i = 0; i < ind; i ++){
	    nod = nod.getNext();
	}
	tmp.setNext(nod.getNext());
	nod.setNext(tmp);
    }

    public String toString() {
	String s= "";
	Node<E> tmp = head.getNext();
	while (tmp !=null){
	    s=s+tmp.getData()+" ";
	    tmp=tmp.getNext();
	}
	return s;
    }
    public E get(int ind){
	Node<E> nod = head;
	for (int i = 0; i < ind ; i++){
	    nod = nod.getNext();
	}
	return nod.getNext().getData();
    }
    
    public E remove(int ind){
	Node<E> nod = head;
	for (int i = 0; i < ind ; i++){
	    nod = nod.getNext();
	}
	Node<E> tmp = nod.getNext();
	if (tmp != null)
	    nod.setNext(nod.getNext().getNext());
	else
	    nod.setNext(null);
	return tmp.getData();
    }

    public int length(){
	Node<E> nod = head.getNext();
	int count = 0;
	while (nod != null){
	    count++;
	    nod = nod.getNext();
	}
	return count;
    }
    
    public int find(E s){
	Node<E> nod = head.getNext();
	for (int i = 0; i< length(); i++){
	    if (nod.getData().equals(s)){
		return i;
	    }
	    nod = nod.getNext();
	}
	return -1;
    }

}
