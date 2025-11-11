import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get array elements from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Repeat search until user decides to stop
        char choice;
        do {
            System.out.print("Enter number to search: ");
            int target = sc.nextInt();

            int position = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    position = i;
                    break;
                }
            }

            if (position == -1) {
                System.out.println(target + " not found in the array.");
            } else {
                System.out.println(target + " found at position " + (position + 1));
            }

            // Ask if the user wants to search again
            System.out.print("Do you want to search another number? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println(); // for neat spacing

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the Linear Search program!");
        sc.close();
    }
}
