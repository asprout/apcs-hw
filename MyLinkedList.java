public class MyLinkedList {
    private Node head;
    private Node tail;
    private int len;

    public MyLinkedList(){
	head = new Node("");
	tail = new Node("");
	len = 0;
    }
    
    public void add(String s){
	Node tmp = new Node(s);
	Node t2 = head.getNext();
	for (int i = 0; i < len; i++){
	    t2 = t2.getNext();
	}
	t2.setNext(tmp);
	tmp.setNext(tail);
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
	if (i>len){
	    return ;
	}
	else {
	    Node temp = head.getNext();
	    Node t2 = head;
	    for (int x = 0; x < i; x++){
		t2 = temp;
		temp = temp.getNext();
	    }
	    Node n = new Node(s);
	    t2.setNext(n);
	    n.setNext(temp);
	    len = len + 1;
	}
    }

    public String get(int i){
	Node temp = head.getNext();
	for (int c = 0; c<i; c++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }

    public String remove(int i){
	Node temp = head.getNext();
	Node t2 = head;
	for (int l = 0; l < i; l++){
	    t2 = temp;
	    temp = temp.getNext();
	}
	t2.setNext(temp.getNext());
	String old = tmp.getData();
	len = len - 1;
	return old;
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