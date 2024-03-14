package youtube2;

public class HeapSortMain {
    public static void heapifyMax(int[] arr, int n, int i) {
        int largest = i;    
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
        
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapifyMax(arr, n, largest);
        }
    }

    public static void heapifyMin(int[] arr, int n, int i) {
        int smallest = i;   
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapifyMin(arr, n, smallest);
        }
    }

    public static void heapSort(int[] arr, boolean isMaxHeap) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            if (isMaxHeap) {
                heapifyMax(arr, n, i);
            } else {
                heapifyMin(arr, n, i);
            }
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            if (isMaxHeap) {
                heapifyMax(arr, i, 0);
            } else {
                heapifyMin(arr, i, 0);
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] maxHeapArray = {4, 10, 3, 5, 1};

        int[] minHeapArray = {4, 10, 3, 5, 1};

        System.out.println("Max Heap Oluşturma:");
        heapSort(maxHeapArray, true);
        printArray(maxHeapArray);

        System.out.println("Min Heap Oluşturma:");
        heapSort(minHeapArray, false);
        printArray(minHeapArray);
    }
}

