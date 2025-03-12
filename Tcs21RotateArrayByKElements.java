/*
Enter the number of elements: 7
Enter 7 numbers:
1 2 3 4 5 6 7
Enter the number of positions to rotate: 3

Output: 4 5 6 7 1 2 3
*/
import java.util.Arrays;
import java.util.Scanner;

public class Tcs21RotateArrayByKElements {
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

        System.out.print("Enter the number of positions to rotate: ");
        int k = scanner.nextInt();
        scanner.close();

        //Rotation numbers
        int[] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        int index = 0;
        int[] rotatedArray = new int[n];
        for(int i=k; i<n;i++){
            rotatedArray[index++] = arr[i];
        }
        for(int i=0; i<k; i++){
            rotatedArray[index++] = temp[i];
        }
        System.out.println(Arrays.toString(rotatedArray));
    }
}
