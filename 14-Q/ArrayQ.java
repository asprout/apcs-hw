import java.io.*;
import java.util.*;

public class ArrayQ {
    
    private String[] q;
    private int head, tail;
    private int length; //elements in list 
    private int size; //array size

    public ArrayQ(int s){
	head = 0; 
	tail = 0;
	length = 0;
	size = s;
	q = new String[s];
    }

    public String toString(){
	String s = "";
	int i = head;
	while (i != tail){
	    s = s + q[i] + ", ";
	    i++;
	    if (i >= size){
		i = 0;
	    }
	}
	return s;
    }
		    
    public void dequeue(){
	q[head] = null;
	head++;
	length--;
	if (head >= size){
	    head = 0;
	}
    }

    public void enqueue(String s){
	if (tail < size){
	    q[tail] = s;
	    tail++;
	}
	else {
	    tail = tail % size;
	    q[tail] = s;
	}
	length++;
    }

    public boolean isEmpty(){
	return q[head] == null;
    }
    
    public int length(){
	return length;
    }

    public String front(){
	return q[head];
    }

}