import java.util.Arrays;
import java.util.Scanner;

public class Tcs20IncreasingDecreasingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Get array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // Sort array in ascending order
        Arrays.sort(arr);

        //Initialize empty array
        int[] result = new int[n];
        int index=0;

        //Add 1st half of array in increasing order
        for(int i=0; i<(n+1)/2; i++){
            result[index++] = arr[i];
        }

        //Add 2nd half of array in decreasing order
        for(int i=n-1; i>=(n+1)/2; i--){
            result[index++] = arr[i];
        }

        System.out.println("Rearranged array (increasing-decreasing order):");
        System.out.println(Arrays.toString(result));
    }
}
