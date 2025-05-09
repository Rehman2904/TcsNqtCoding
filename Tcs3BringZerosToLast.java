import java.util.Scanner;

/*
Input: [4, 0, 0, 3, 1, 12]
Output: [4, 3, 1, 12, 0, 0]
 */
public class Tcs3BringZerosToLast {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int temp, j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
