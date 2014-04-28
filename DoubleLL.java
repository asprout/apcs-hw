public class DoubleLL<E> {
    private class Node<E> {
	E data;
	Node<E> next, prev;

	public Node(E d) {
	    this.data = d;
	}
	
	public String toString(){
	    return "" + data;
	}
	
	public void setData(E d){
	    data = d;
	}
	
	public E getData(){
	    return data;
	}

	public void setNext(Node<E> n){
	    next = n;
	}

	public Node<E> getNext(){
	    return next;
	}

	public void setPrev (Node<E> p){
	    prev = p;
	}
	
	public Node<E> getPrev(){
	    return prev;
	}
    }

    private Node<E> current; 
    private Node<E> head;
    int len;
    
    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if (current == null){
	    current = n;
	    head = n;
	}
	else {
	    n.setNext(current);
	    n.setPrev(current.getPrev());
	    if (current.getPrev() != null)
		(current.prev).setNext(n);
	    current.setPrev(n);
	    current = n;
	    head.setNext(current);
	    current.setPrev(head);
	}
	len++;
    }

    public E getCurrent(){
	return current.getData();
    }
    
    public void forward(){
	if (current.getNext() != null)
	    current = current.getNext();
    }
    public void back(){
	if (current.getPrev() != null)
	    current = current.getPrev();
    }
    public String toString(){
    	Node<E> tmp = head;  
    	if (tmp == null)
    	    return "";
    	// while (tmp.getPrev() != head)
    	//     tmp = tmp.getPrev();
	
    	//Node<E> tmp = current;
    	String s = "";
    	for (int i = 0; i<len -1 ;i++){
    	    s = s + tmp.getData() + " ";
    	    tmp = tmp.getNext();
    	    //System.out.println(":" + s);
    	}
    	return s;
    }
   
    
    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//First test up to here

	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	

    }
}