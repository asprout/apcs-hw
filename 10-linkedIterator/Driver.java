public class Driver {
    public static void main(String[] args){
	myLinkedList<String> a = new myLinkedList();
	a.add("wan");
	a.add("tew");
	a.add("tree");
	a.add("wong");
	System.out.println(a);
	a.remove(a.length() - 1);
	System.out.println(a);
	a.add(3, "four");
	System.out.println(a);
	System.out.println(a.length());
	System.out.println(a.get(2));
	System.out.println(a.find("tew"));
	System.out.println("\nTop answers should be: 4, tree, 1");


	//ITERATOR TESTING

	
	myLLIterator<String> it = a.iterator();
	System.out.println(it.hasNext());
	System.out.println(it.next());
	
    }
}
