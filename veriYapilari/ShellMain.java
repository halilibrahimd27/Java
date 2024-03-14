package youtube2;
import java.util.Arrays;

public class ShellMain {

	public static void main(String[] args) {
		
		int[] a = {5,8,9,6,3,1,4,7};
		System.out.println(Arrays.toString(a));
		ShellMain.shellShort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void shellShort(int[] n) {
		int d = n.length;
		int tmp = 0;
		int i = 0, j = 0;
		int gap = 0;
		
		for (gap = d/2; gap > 0; gap /= 2) {
			for (i = gap; i < d; i += gap) {
				tmp = n[i];
				for (j = i; j > 0 && n[j-gap] > tmp ; j -= gap) {
					n[j] = n[j - gap]; 
				}
				n[j] = tmp;
			}
		}
	}
}