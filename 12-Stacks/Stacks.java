import java.io.*;
import java.util.*;

public class Stacks {

    private int top;
    private int size;
    private String[] stack;
    
    //constructor
    public Stacks() {
	top = 0;
	size = 0;
	stack = new String[10];
    }

    //grow
    public void grow(int l){
	String[] newlist = new String[l+stack.length];
	for (int i = 0; i < size; i++){
	    newlist[i] = stack[i];
	}
	stack = newlist;
    }

    //push
    public void push(String s){
	if (!(stack[stack.length -1] == null))
	    grow(stack.length);
	stack[size] = s;
	top++;
	size++;
    }

    //pop
    public String pop(){
	String s = stack[size-1];
	stack[size-1] = null;
	size--;
	top--;
	return s;
    }
    
    public int getSize(){
	return size;
    }
    
    //peek
    public String peek() {
	return stack[size-1];
    }

    //isEmpty
    public boolean isEmpty(){
	return stack[0] == null;
    }
    
    //toString
    public String toString(){
	String tmp = "";
        for (int i = 0 ; i < size; i++){
	    tmp = tmp + stack[i] + ", ";
	}
	return tmp;
    }

}
