import java.util.Scanner;

public class HeapSort {
    // Heapify function (max-heap)
    static void heapify(int[] arr, int n, int i) {
        int largest = i;      // root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2;// right child

        // If left child is bigger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is bigger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If root is not the largest, swap and keep heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Heap Sort
    static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end (largest element)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Utility function to print array
    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Main function — user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);

        sc.close();
    }
}
