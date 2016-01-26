package allgemeineUebungen;

import edu.princeton.cs.algs4.StdOut;

public class Exercises_1_3 {

	public static void main(String[] args) {
		//1.3.1
		FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(5);
		for(int i = 0; i < 5; i++) {
			s.push(""+i);
		}
		StdOut.println(s.isFull());
		
	}

}
