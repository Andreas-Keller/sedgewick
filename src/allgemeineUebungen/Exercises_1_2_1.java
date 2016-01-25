package allgemeineUebungen;

import edu.princeton.cs.algs4.*;

public class Exercises_1_2_1 {
	
	public static void main( String args[]){
		
		final int n = Integer.parseInt(args[0]);
		int counter = 0;
		Point2D pa[] = new Point2D[n];
		double dist = 0;
		
		while(counter < n){
		
			Point2D p = new Point2D(StdRandom.uniform(), StdRandom.uniform());
			p.draw();
			pa[counter] = p;
			counter++;
		
		}
		
		int a = 0,b = 0;
		
		while(a < pa.length){
			b=0;
			while(b < pa.length){
			
				if (pa[a].distanceTo(pa[b]) > dist) {
					dist = pa[a].distanceTo(pa[b]);	
					StdOut.println(dist);
				}
			b++;
			}
			a++;
		}
		StdOut.println("---------");
		StdOut.println(dist);
	}
}
