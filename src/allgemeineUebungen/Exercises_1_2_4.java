package allgemeineUebungen;
import edu.princeton.cs.algs4.*;

public class Exercises_1_2_4
{
	public static void main (String args[]){
		//1.2.4
		String string1 = "hello";
		String string2 = string1;
		string1 = "world";
		StdOut.println(string1);
		StdOut.println(string2);
		
		//1.2.5
		String s = "Hello World";
		s=s.toUpperCase();
		s=s.substring(6,11);
		StdOut.println(s);
		
		//1.2.6
		String a = "ACTGACG";
		String b = "TGACGAC";
		StdOut.println(a.concat(a).indexOf(b)>=0);
		
		//1.2.7
		StdOut.println(mystery("test"));
	}
	
	public static String mystery(String s){
		int n = s.length();
		if(n<=1) return s;
		String a = s.substring(0, n/2);
		String b = s.substring(n/2, n);
		return mystery(b) + mystery(a);
	}
}
