//DELETE: three cases; in all cases, we need a pointer to the parent node
//will be done either via piggyback search or recursion
//LEAF: easiest. using node before it and setLeft/setRight to null
//ONE CHILD: switch the pointer from the node to its child, but make sure to get             the pointer directions right!
//CHILDREN: replace the deleted value with largest left or smallest right                   we find it by going as far towards one direction as possible, delete
//ROOT: dummy node of smallest possible value 

//PRE-ORDER TRAVERSAL: process, traverse(left), traverse(right)
//IN-ORDER TRAVERSAL: traverse(left), process, traverse(right)
//POST-ORDER TRAVERSAL: traverse(left), traverse(right), process
//expression tree
/* (a+b)*(c-d), ab+cd-*, (* (+ a b) (- c d))
         *
	/ \
       +   -
      / \ / \
     a  b c  d
*/


public class BST {
    
    private Node root;

    public BST(){
	root = null;
    }

    public BST(Node n){
	root = n;
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

    public void print(){
	print(root,0);
	System.out.println();
    }

    public void printInOrder(Node a, int b){
	if (a == null)
	    System.out.println(""+null);
	else{
	    print(a.getLeft(), b+1);
	    System.out.println(""+a.getData());
	    print(a.getRight(), b+1);
	}
    }

    public void print(Node a, int b){
	System.out.println();
	for (int i = 0; i <b; i++)
	    System.out.print(" ");
	if (a == null)
	    System.out.print(""+null);
	else{
	    System.out.print(""+a.getData());
	    print(a.getLeft(), b+1);
	    print(a.getRight(), b+1);
	}
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

    //gives the parent node of an element
    // Node(0) if the element is in the root
    public Node parentSearch(int x){
	Node p = root;
	Node ret = new Node(-1);
	while (p != null && p.getData()!=x){
	    if (p.getData() > x){
		ret = p;
		p = p.getLeft();
	    }
	    else {
		ret = p;
		p = p.getRight();
	    }
	}
	return ret;
    }

    public Node largestRight(Node n){
	if (n.leftNull())
	    return n;
	n = n.getLeft();
	while (n.getRight() != null){
	    n = n.getRight();
	}
	return n;
    }
    
    public Node smallestLeft(Node n){
	if (n.rightNull())
	    return n;
	n = n.getRight();
	while (n.getLeft() != null){
	    n = n.getLeft();
	}
	return n;
    }

    public void delete(int x){
	Node current = search(x);
	Node place = current;
	if (current == null)
	    return;
	else if (!current.leftNull() && !current.rightNull()){
	    Node rep = largestRight(current);
	    Node temp = parentSearch(largestRight(current).getData());
	    System.out.println("c"+rep);
	    if (!temp.equals(current)){
		temp.setRight(null);
	    }else {
		current.setLeft(null);
	    }
	    rep.setRight(current.getRight());
	    rep.setLeft(current.getLeft());
	    current = rep;
	    if (place.equals(root))
		root = rep;
	}
	else {
	    Node par = parentSearch(current.getData());
	    if (current.leftNull() && current.rightNull()){
		if (par.getData() > current.getData())
		    par.setLeft(null);
		else
		    par.setRight(null);
		current = null;
	    }
	    else if (current.leftNull()){
		current = current.getRight();
	    	if (!(current.rightNull() == true))
	    	    current.setRight(null);
	    }else{ 
	    	current = current.getLeft();
	    	if (!(current.leftNull() == true))
	    	    current.setLeft(null);
	    }
	    if (place.equals(root))
		    root = par;
	}
    }
 
    public void insert(int x){
	if (root == null){
	    root = new Node(x);
	    return;
	}
	if (root.getData() == -1){
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
