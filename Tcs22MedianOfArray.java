import java.util.Arrays;
import java.util.Scanner;

public class Tcs22MedianOfArray {
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
        Arrays.sort(arr);
        double median;
        if(n%2==1){
            median = arr[n/2];
        }else{
            median = (double)(arr[n/2]+arr[n/2 - 1])/2;
        }
        System.out.println(median);
    }
}
