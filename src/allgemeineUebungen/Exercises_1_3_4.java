// Stack-Client "Parantheses", der richtige Klammersetzung überprüft

package allgemeineUebungen;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercises_1_3_4 {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();
		boolean correct = false;
		String test = "";
		while(!StdIn.isEmpty()) {
			String p = StdIn.readString();
			if ( p.equals("(") ) s.push("(");
			else if ( p.equals("[") ) s.push("[");	
			else if ( p.equals("{") ) s.push("{");
			else {
				test = s.pop();
				if ( p.equals(")") && test.equals("(")) correct = true;
				else if ( p.equals("]") && test.equals("[")) correct = true;
				else if ( p.equals("}") && test.equals("{")) correct = true;
				else correct = false;
			}
		}
		
		StdOut.println("Stack empty " + s.isEmpty());
		StdOut.println("Parantheses " + correct);
	}
}
