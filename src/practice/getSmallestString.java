package practice;

import java.util.Arrays;

public class getSmallestString {

	public static void main(String[] args) {
		System.out.println(getTheString(3,45));
	}
	
	public static String getTheString(int n, int k) {
		char[] c = new char[n];
		System.out.println(k);
		for(int i=0;i<n;i++) {
			c[i] = 'a';
		}
		k = k - n;;
	    System.out.println(k);
	    while(k>0) {
	        c[--n] += Math.min(25,k);
	        k= k - 25;
	    }
	    
	    return new String(c);
	}
	
}
