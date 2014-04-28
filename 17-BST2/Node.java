public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int s) {
	data=s;
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
    public Node getRight() {
	return right;
    }
    public String toString() {
	return ""+data;
    }
}
