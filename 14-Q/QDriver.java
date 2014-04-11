import java.io.*;
import java.util.*;

public class QDriver {

    public static void main (String[] args){
	ArrayQ q = new ArrayQ(10);
	System.out.println(q);
	q.enqueue("element");
	q.enqueue("two");
	System.out.println(q);
	q.dequeue();
	System.out.println(q);
    }
}
