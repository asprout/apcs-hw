public class Driver {
    
    public static void main(String[] args){
	MyLinkedList l = new MyLinkedList();
	
	l.add("A");	
	System.out.println(l);
	l.add("B");
	System.out.println(l);
	l.add("C");
	System.out.println(l);
	l.add("D");
	System.out.println(l);
	l.add("E");
	System.out.println(l);
	System.out.println("Length: " + l.length());
	System.out.println("remove index 2, then 0, then 1, then last");
	l.remove(2);
	System.out.println(l);
	l.remove(0);
	System.out.println(l);
	l.remove(1);
	System.out.println(l);
	l.remove(l.length() - 1);
	System.out.println(l);

    }
}