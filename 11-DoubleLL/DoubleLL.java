public class DoubleLL<E> {

    private class Node<E> {
        E data;
        Node<E> next, prev;
	public Node(E d) {
	    data = d; 
	}
        public String toString() { 
	    return "" + data; 
	}
        
        public void setData(E d) { data = d; }
        public E getData() { return data; }
        
        public void setNext(Node<E> n) { next = n; }
        public Node<E> getNext() { return next; }
        
        public void setPrev(Node<E> p) { prev = p; }
        public Node<E> getPrev() { return prev; }
    }
    
    private Node<E> current;
    private Node<E> head;
    private int len;
    
    public void insert(E d) {
        Node<E> n = new Node<E>(d);        
        if (current == null) {
            current = n;
	    head = n;
	    len = 1;
	}
        else {
            n.next = current;
            if (current.prev != null) {
                current.prev.next = n;
	    }
	    n.prev = current.prev;
            current.prev = n;
            current = n;
	    len++;
        }
    }

    public int length(){
	return len;
    }
    
    public E getCurrent() { 
	return current.getData(); 
    }
    
    public void forward() {
        if ( current.getNext() != null )
            current = current.getNext();
    }
    
    public void back() {
        if ( current.getPrev() != null )
            current = current.getPrev();
    }

    public String toString() {
        if ( current == null )
            return "";        
        while ( current.getPrev() != null )
            current = current.getPrev();
        
        Node<E> tmp = current;
        String s = "";
	while ( tmp != null ) {
            s = s + tmp.getData() + " ";
            tmp = tmp.getNext();
        }        
        return s;
    }

    public int find(E s){
	Node<E> temp = head;
	int i = 0;
	while (temp != null){
	    if ((temp.getData()).equals(s)){
		return i;
	    }
	    temp = temp.getNext();
	    i++;
	}
	return -1;
    }

    public void delete(int s){
	if (s+2>=len){
	    return;
	}
	else {
	    Node<E> one = head;
	    Node<E> two = head;
	    for (int i = 0; i < s + 2; i++){
		if (i < s)
		    one = one.getNext();
		two = two.getNext();
	    }
	    one.setNext(two);
	    two.setPrev(one);
	}
	len--;
    }	       
		    
    
    public static void main(String[] args) {
        DoubleLL<String> L = new DoubleLL<String>();
        System.out.println(L);
        L.insert("hello");
        System.out.println(L);
        L.insert("world");
        System.out.println(L);
        L.insert("three");
        System.out.println(L);
        // First test up to here
        System.out.println(L.getCurrent());
        L.forward();
        System.out.println(L.getCurrent());
        L.insert("inserted");
        System.out.println(L);
	System.out.println(L.find("hello"));
	//i can't figure out how to do find, delete methods...
	L.delete(0);
	System.out.println(L);
       
    }
}
