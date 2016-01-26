package allgemeineUebungen;

import java.io.IOException;
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import listings.Counter;

public class Exercises_1_2_9 {

	public static void main(String args[]) throws IOException {
		
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		Counter counter = new Counter("Keys");
		
		while (!StdIn.isEmpty()) {
			//Liest Schlüssel ein, gibt ihn aus, wenn er nicht in der Positivliste ist.
			int key = StdIn.readInt();
			if ( rank(key, whitelist, counter) < 0)
				StdOut.println(key);
		}
		StdOut.println(counter.toString());
	}
	
	public static int rank(int key, int a[], Counter counter) {
		//Array muss sortiert sein
		int lo = 0;
		int hi = a.length-1;
		while ( lo <= hi ) {
			//Schlüssel key in a[lo..hi] oder nicht vorhanden.
			int mid = lo + (hi - lo) / 2;
			if ( key < a[mid] ) hi = mid -1;
			else if ( key > a[mid] ) lo = mid + 1;
			else {
				counter.increment();
				return mid;
			}
		}
		counter.increment();
		return -1;
	}
}
