import java.io.*;
import java.util.*;


public class myLLIterator<E> implements Iterator<E> {

    private Node<E> currentNext;
    private boolean canRemove;

    public myLLIterator(Node<E> n) {
	currentNext = n;
    }
    public boolean hasNext() {
	return currentNext!=null;
    }
    public E next() {
	if (hasNext()){
	    E r = currentNext.getData();
	    currentNext=currentNext.getNext();
	    canRemove = true;
	    return r;
	}
	else {
	    return null;
	}
    }
    public void remove() {
	if (!canRemove){
	    throw new IllegalStateException();
	}
	
    }
}
  
