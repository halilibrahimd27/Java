package youtube2;

import java.util.Arrays;

public class QuickMain {

	public static void main(String[] args) {
		
		int[] d = {5,8,9,6,45,7,78,69,12,36};
		System.out.println(Arrays.toString(d));
		QuickMain.quickSort(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
	}

	public static void quickSort(int[] d,int l, int r) {
		if (l < r) {
			int pi = partition(d, l, r);
			quickSort(d, l, pi-1);
			quickSort(d, pi+1, r);
		}	
	}
	
	public static int partition(int[] d,int l, int r) {
		
		int pi = r;
		int i = l;
		int j = r-1;
		do {
			while(d[i] < d[pi] && i < r) i++; 
			while(d[j] > d[pi] && j > 0) j--; 
			if(i<j) swap(d, i, j);
		} while (i < j);
		
		swap(d, i, pi);
		return i;
	}
	
	public static void swap(int[] d, int i, int j) {
		int tmp = 0;
		tmp = d[i];
		d[i] = d[j];
		d[j] = tmp;
	}
}
