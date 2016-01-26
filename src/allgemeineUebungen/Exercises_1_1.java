package allgemeineUebungen;

import edu.princeton.cs.algs4.*;

public class Exercises_1_1 {
	
	public static void main (String args[]) {
		
		// 1.1.3 
		StdOut.println("Enter three Integers");
		
		int x = StdIn.readInt();
		int y = StdIn.readInt();
		int z = StdIn.readInt();

		if (x == y && y == z)
			StdOut.println("Numbers are equal");
		else
			StdOut.println("Numbers are not all equal");
		
		
		// 1.1.6. Fibonacci
		int f = 0;
		int g = 1;
		for ( int i = 0; i <= 15; i++){
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
		
		// 1.1.7 a.
		double t = 9.0;
		while (Math.abs( t - 9.0 / t) > 0.001)
			t = ( 9.0 / t + t) / 2.0 ;
		StdOut.printf("%.5f\n", t);
		
		// 1.1.7 b.
		int sum = 0;
		for ( int i = 0; i < 1000; i++ )
			for ( int j = 0; j < i; j++ )
				sum++;
		StdOut.println(sum);
		
		// 1.1.7 c.
		int sum2 = 0;
		for ( int i = 1; i < 1000; i *= 2 )
			for ( int j = 0; j < 1000; j++ )
					sum2++;
		StdOut.println(sum2);

		//1.1.8
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char)('a'+ 4));
		
		
		//1.1.9
		int bin = 32;
		StringBuilder strb = new StringBuilder();
		while (bin>0) {
			if ( bin % 2 == 0 )
				strb.append(0);
			else
				strb.append(1);
			bin /= 2;
		}
		strb.reverse();
		StdOut.println(strb.toString());
		
		//1.1.11
		boolean[][] strs = {{true, false, true},{false, false, true}, {true, true, false}};
		for ( int k = 0; k < strs.length ; k++) {
			for ( int l = 0; l < strs[k].length ; l++) {
				if (strs[k][l] == true)
					StdOut.print('*');
				else StdOut.print(' ');
				System.out.print(k + "/" + l);
			}
			System.out.println();
		}
		
		//1.1.12
		int[] a = new int[10];
		for ( int q = 0; q < 10; q++)
			a[q] = 9 -1;
		for ( int q = 0; q < 10; q++)
			a[q] = a[a[q]];
		for ( int q = 0; q < 10; q++)
			System.out.println(q);
		
		//1.1.13
		int M = 4;
	    int N = 3;
	    int[][] mn = new int[M][N];
	    int[][] nm = new int[N][M];
	    for ( int k = 0; k < mn.length ; k++) {
			for ( int l = 0; l < mn[k].length ; l++) {
				mn[k][l] = StdRandom.uniform(1, 10);
				StdOut.print(mn[k][l]);
			}
			StdOut.println();
		}
	    StdOut.println();
	    
	    for ( int k = 0; k < mn.length ; k++) {
			for ( int l = 0; l < mn[k].length ; l++) {
				nm[l][k] = mn[k][l];
			}
		}
	    
	    for ( int k = 0; k < nm.length ; k++) {
			for ( int l = 0; l < nm[k].length ; l++) {
				StdOut.print(nm[k][l]);
			}
			StdOut.println();
		}
	    
	    //1.1.14
	    StdOut.println(lg(256));
	    
	    //1.1.15
	    int[] init1 = { 1,4,7,5,3,8,9,4,3,2,6,5,3,4,6,1 };
	    int[] res1 = histogram(init1, 10);
	    int res2 = 0;
	    for (int i = 0; i < res1.length; i++) {
	    	res2 += res1[i];
	    }
	    System.out.println(res2 == init1.length);
	    
	    //1.1.16
	    StdOut.println(exR1(6));
	}
	
	//1.1.14
	private static int lg(int N) {
		
		int seed = 0;
		while( N != 0) {
			if (N == 1 ) break;
			N /= 2;
			seed++;
		}
		return seed;
	}
	
	//1.1.15
	private static int[] histogram(int a[], int M) {
		int b[] = new int[M];
		for( int i = 0; i < a.length; i++) {
			b[a[i]] += 1;
		}
		return b;
	}
	
	private static String exR1(int n) {
		if ( n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
}
