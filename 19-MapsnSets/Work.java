import java.io.*;
import java.util.*;

public class Work {

    public static void main(String[] args){
	long start = System.currentTimeMillis();

	TreeMap tree = new TreeMap(); // constructor slower generally
	// tree.put("a", 1);
	// tree.put("b", 2);
	// tree.put("c", 3); // put is slower for tree than for hash

	long total = System.currentTimeMillis() - start;
	System.out.println(total);

	start = System.currentTimeMillis();
	
	HashMap hash = new HashMap();
	// hash.put("a", 1);
	// hash.put("b", 2);
	// tree.put("c", 3);
	
	total = System.currentTimeMillis() - start;
	System.out.println(total);
	//

	// start = System.currentTimeMillis();

	// tree.clear(); // clear is the same for both

	// total = System.currentTimeMillis() - start;
	// System.out.println(total);

	// start = System.currentTimeMillis();
	
	// hash.clear();
	
	// total = System.currentTimeMillis() - start;
	// System.out.println(total);

	//

	// start = System.currentTimeMillis();

	// tree.remove("a"); //remove is the same
	// tree.remove("b");
	// tree.remove("c");

	// total = System.currentTimeMillis() - start;
	// System.out.println(total);

	// start = System.currentTimeMillis();
	
	// hash.remove("a");
	// hash.remove("b");
	// hash.remove("c");
	
	// total = System.currentTimeMillis() - start;
	// System.out.println(total);

    }
}