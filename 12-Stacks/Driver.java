public class Driver {
    public static void main(String[] args){
	Stacks stack = new Stacks();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	System.out.println(stack);
	while (!stack.isEmpty()){
	    System.out.println(stack.pop());
	}

	stack.push("hello");
	stack.push("world");
	System.out.println(stack);
	System.out.println(stack.getSize());
    }
}
