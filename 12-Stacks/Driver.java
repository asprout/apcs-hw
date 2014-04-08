public class Driver {
    public static void main(String[] args){
	Stacks stack = new Stacks();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	for (int i = 0; i < 10; i++){
	    stack.push("push");
	}
	//Jake reminded me to check the grow method
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
