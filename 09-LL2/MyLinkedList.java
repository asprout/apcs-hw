public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
	head = new Node("");
    }
    
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
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
	Node o;
	if (i==0){
	    o = head;
	    head = head.getNext();
	}
	else {
	    i = i + 1;
	    for (int x = 0; x < i - 2; x++ ){
		temp = temp.getNext();
	    }
	    o = temp.getNext();
	    temp.setNext(o.getNext());
	}
	return o.getData();
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
	Node temp = head;
	int i = 0;
	while (temp!= null){
	    temp = temp.getNext();
	    i++;
	}
	return i;
    }

}