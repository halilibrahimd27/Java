package youtube2;

import java.util.Arrays;

public class MergeMain {

	public static void main(String[] args) {
		int[] d = {8,6,5,7,4,2,3,1,9};
		System.out.println(Arrays.toString(d));
		MergeMain.merge(d, 0, d.length-1);
		System.out.println(Arrays.toString(d));
		
	}
	
	public static void merge(int[] dizi , int l , int r) {	
		if (l < r) {
			int m = l+(r-l)/2;
			merge(dizi, l, m);
			merge(dizi, m+1, r);
			birlestir(dizi, l, m, r);
		}
	}
	
	public static void birlestir(int[] a, int l, int m, int r) {
		int i = l;
		int j = m+1;
		
		int[] t = new int[r-l+1];
		int k = 0;
		
		while (i <= m && j <= r) {
			if (a[i] < a[j]) {
				t[k] = a[i];
				i++;
			}else {
				t[k] = a[j];
				j++;
			}
			k++;
		}	
		
		while (i <= m) {
			t[k] = a[i];
			i++;
			k++;
		}		
		
		while (j <= r) {
			t[k] = a[j];
			j++;
			k++;
		}
		
		for(i =0; i < t.length ;i++) {
			a[l++] = t[i];
		}
	}
}
