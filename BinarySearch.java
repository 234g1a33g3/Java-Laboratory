import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + right / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 14, 16, 23, 38, 42, 55, 67};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found in the list.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();
    }
}
