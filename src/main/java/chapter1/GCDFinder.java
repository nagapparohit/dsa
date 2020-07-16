package chapter1;

public class GCDFinder {

	/**
	 * This method take two positive integers and find their gcd using Eculid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int gcd(int a,int b) {
		if(b==0) 
			return a;
		else
			return gcd(b,a%b);
		
	}
	
}
