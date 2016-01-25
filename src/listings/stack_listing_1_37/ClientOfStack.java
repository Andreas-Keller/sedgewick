package listings.stack_listing_1_37;

import edu.princeton.cs.algs4.*;

public class ClientOfStack {

	public static void main(String[] args) {
		
		ResizingArrayStack<String> stack = new ResizingArrayStack<>();
		
		while(!StdIn.isEmpty() ) {
			stack.push(StdIn.readString());
		}
		
		for ( String s : stack) {
			StdOut.println(s);
		}
		
	}
}
