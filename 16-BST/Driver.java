public class Driver {
    public static void main(String[] args){
	BST b = new BST();
	b.insert(2);
	System.out.println(b.search(2));
	b.insert(1);
	b.insert(3);
	System.out.println(b.search(1));
	System.out.println(b.search(3));
	b.insert(5);
	b.insert(4);
	b.insert(0);
	System.out.println(b);
	System.out.println(b.search(3));
	System.out.println(b.search2(3));

    }
}