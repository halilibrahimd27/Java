package youtube2;

public class Recursive {
	
	public static void main(String[] args) {
		
		System.out.println(Recursive.fak(5));
		System.out.println(Recursive.tersFak(5, 1));
		System.out.println(Recursive.fib(10));
	}
	
	public static int fak(int a) {
		if (a == 1) {
			return 1;
		}else {
			return a * fak(a - 1);
		}
	}
	
	public static int tersFak(int a, int i) {
		if (a == i) {
			return i;
		}
		return i * tersFak(a, i + 1);
	}
	
	public static int fib(int a) {
		if (a == 1) {
			return 0;
		}else if (a < 4) {
			return 1;
		}else {
			return fib(a-1) + fib(a-2);
		}
	}
}