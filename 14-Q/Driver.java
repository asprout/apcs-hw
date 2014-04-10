public class Driver {
    public static void main(String[] args){
	
	Queue q = new Queue();
	System.out.println(q);
	q.enqueue("first");
	System.out.println(q);
	q.enqueue("second");
	System.out.println(q);
	q.enqueue("third");
	System.out.println(q);
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println("Is Q empty?: " + q.isEmpty());
    }
}