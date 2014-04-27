public class BST {
    
    private Node root;

    public BST(){
	root = null;
    }
   
    public String toString(){	
	return toString(root);
    }

    public String toString(Node a){
	String s = "";
	if (a != null)
	    s += "" + a.getData() + "\n" ;
	if (a.getLeft() != null)
	    s += "Left: " + toString(a.getLeft()) + "\n" ;
	if (a.getRight() != null)
	    s += "Right: " + toString(a.getRight()) + "\n" ;
	return s;
    }

    public Node search(int x){
	Node p = root;
	while (p != null && p.getData()!=x){
	    if (p.getData() > x){
		p = p.getLeft();
	    }
	    else {
		p = p.getRight();
	    }
	}
	return p;
    }
    
    public void insert(int x){
	if (root == null){
	    root = new Node(x);
	    return;
	}
	Node next = root;
	Node piglet = root;
	while (next!= null){
	    
	    if (x < next.getData()){
		next = next.getLeft();
		if (next == null)
		    piglet.setLeft(new Node(x));
	    }
	    else {
		next = next.getRight();
		if (next == null)
		    piglet.setRight(new Node(x));
	    }
	    piglet = next;
	}
    }
    
    public Node search2(int x){
	return search2(root, x);
    }
    
    public Node search2(Node c, int x){
	if ( c == null){
	    return null;
	}
	else if (c.getData() == x){
	    return c;
	}
	else if (c.getData() < x){
	    return search2(c.getRight(), x);
	}
	else {
	    return search2(c.getLeft(), x);
	}
    }

}