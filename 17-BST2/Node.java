public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int s) {
	data=s;
	left = null;
	right = null;
    }
    public void setData(int s) {
	data = s;
    }
    public int getData() {
	return data;
    }
    public void setLeft(Node n) {
	left = n;
    }
    public void setRight(Node n) {
	right = n;
    }
    public Node getLeft() {
	return left;
    }

    public boolean leftNull(){
	if (left == null)
	    return true;
	return false;
    }

    public boolean rightNull(){
	if (right == null)
	    return true;
	return false;
    }

    public Node getRight() {
	return right;
    }
    public String toString() {
	return ""+data+" (Left : "+left+" Right : "+right+" )";
    }
}
