// if */+- pop twice, calc and push
// else just push
// use scanner to read string
// use doubles

import java.io.*;
import java.util.*;

public class RPN {

    public static boolean isNum(String i){
	try {
	    Double.parseDouble(i);
	    return true;
	}
	catch (Exception e){
	    return false;
	}
    }
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean go = true;
	Stacks stack = new Stacks();
	System.out.println("Enter your commands. Submit h for help");

	while (go){
	    String input = sc.nextLine();
	    if (input.equals("h")){
		System.out.println("enter 'clear' to clear");
		System.out.println("the four commands are +, -, /, *");
		System.out.println("enter 'show' to see your stack");
	    }
	    else if (input.equals("clear")){
		stack = new Stacks();
	    }
	    else if (input.equals("show")){
		System.out.println(stack.toString());
	    }
	    else {
		if (isNum(input)){
		    stack.push(input);
		}
		else {
		    if (stack.getSize() == 1){
			System.out.println(stack.peek());
		    }
		    else{
			try {
			    String one = stack.pop();
			    String two = stack.pop();
			    double a = Double.parseDouble(one);
			    double b = Double.parseDouble(two);
			    if (input.equals("+")){
				stack.push(""+(a+b));
				System.out.println(a+b);
			    }
			    else if (input.equals("-")){
				stack.push(""+(a-b));
				System.out.println(a-b);
			    }
			    else if (input.equals("*")){
				stack.push(""+(a*b));
				System.out.println(a*b);
			    }
			    else if (input.equals("/")){
				stack.push(""+(a/b));
				System.out.println(a/b);
			    }
			}
			catch(Exception e){
			    System.out.println("ERROR");
			}
		    }
		}
	    }
	}
    }
}
