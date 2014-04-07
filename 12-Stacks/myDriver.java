public class myDriver {
    public static void main(String[] args){
	myStack stack = new myStack();
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