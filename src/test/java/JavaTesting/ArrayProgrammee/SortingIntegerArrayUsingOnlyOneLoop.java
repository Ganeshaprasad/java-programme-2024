package JavaTesting.ArrayProgrammee;

public class SortingIntegerArrayUsingOnlyOneLoop {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 80}; // Initialize the array

        int i = 0; // Start from the first element

        // Sorting the array using one loop
        while (i < arr.length) {
            // If the current element is greater than the next, swap them
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                // Reset index to 0 to recheck from the beginning
                i = 0;
            } else {
                // Move to the next element if no swap is needed
                i++;
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
