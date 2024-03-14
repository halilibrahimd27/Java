package youtube2;

import java.util.Arrays;

public class RadixMain {

	public static void main(String[] args) {
		int[] d = {158,4986,79,1,365,235,985,8};
		System.out.println(Arrays.toString(d));
		RadixMain.radix(d);
		System.out.println(Arrays.toString(d));
	}
	
	
	public static void count(int[] d, int e) {
		int n = d.length;
		int[] t = new int[n];
		int[] c = new int[10];
		int i = 0;
		
		for (i = 0;  i< n; i++) {
			c[(d[i]/e)%10]++;
		}
		
		for (i = 1;  i< 10; i++) {
			c[i] += c[i-1];
		}
		
		for (i = n-1; i >= 0; i--) {
			t[--c[(d[i]/e)%10]] = d[i];
		}
		
		for(i = 0; i < n; i++) {
			d[i] = t[i];
		}
	}
	
	public static void radix(int[] d) {
		int max = RadixMain.max(d);
		for(int e = 1; (max/e) > 0; e *= 10) {
			RadixMain.count(d,e);
		}
	}
	
	public static int max(int[] d) {
		int max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > max) {
				max = d[i];
			}
		}
		return max;
	}
}