import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Step 2: Take array input from user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Step 3: Sort the array before binary search
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Step 4: Ask user for the element to search
        System.out.print("Enter the number to search for: ");
        int target = input.nextInt();

        // Step 5: Perform binary search
        int result = binarySearch(numbers, target);

        // Step 6: Display result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        input.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Print current search range for clarity
            System.out.println("Checking range [" + left + ", " + right + "], middle index: " + mid);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1; // search the right half
            } else {
                right = mid - 1; // search the left half
            }
        }

        // not found
        return -1;
    }
}
