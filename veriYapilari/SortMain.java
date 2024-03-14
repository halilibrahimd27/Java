package youtube2;

public class SortMain {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }//O(n^2)
	
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }//O(n^2)

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }//O(n) | O(n^2)

    
	public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 2, 11, 90};
        bubbleSort(array);
        System.out.println("Bubble Sort Sonucu:");
        for (int num : array) {
            System.out.print(num + " ");//O(n^2)
        }

        System.out.println();
        System.out.println();
        
        selectionSort(array);
        System.out.println("Selection Sort Sonucu:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println();
        
        insertionSort(array);
        System.out.println("Insertion Sort Sonucu:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}

}
