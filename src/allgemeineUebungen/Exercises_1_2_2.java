package allgemeineUebungen;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;

public class Exercises_1_2_2 {
	
	public static void main (String args[]) {
		
		double[] da = new double[args.length];
		for(int i = 0; i < da.length; i++){
			da[i] = Double.parseDouble(args[i]);
		}
			
		Interval1D[] iv = new Interval1D[da.length/2];
		int dastepper = 0; 
		
		for ( int i = 0; i < iv.length; i++) {
			iv[i] = new Interval1D(da[dastepper], da[++dastepper]);
			dastepper++;
		}
		
		int dawhile = 0;
		int dewhile = 0;
		while(dawhile<iv.length){
			dewhile = 0;
			while(dewhile<iv.length){
				if ( dawhile != dewhile) { 
					if (iv[dawhile].intersects(iv[dewhile])) {
						StdOut.println(iv[dawhile] + " intersects " + iv[dewhile]);
					}
				}dewhile++;
			}
			dawhile++;
		}
		
		
	}
}
