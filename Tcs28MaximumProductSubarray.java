import java.util.*;

public class Tcs28MaximumProductSubarray {
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

        int maxProduct = Integer.MIN_VALUE;
        int[] finalarr = null;

        for(int i=0; i<n; i++){
            int cumProduct = 1;

            for(int j=i; j<n; j++){
                cumProduct *= arr[j];

                if(cumProduct>=maxProduct){
                    maxProduct=cumProduct;

                    int x=0;
                    finalarr = new int[j-i+1];

                    for(int m=i; m<=j; m++){
                        finalarr[x++] = arr[m];
                    }
                }
            }
        }
        if(maxProduct<0){
            finalarr = new int[1];
            int maxNegative = Integer.MIN_VALUE;

            for(int i : arr){
                if(i>maxNegative){
                    maxNegative=i;
                }
            }
            maxProduct=maxNegative;
            finalarr[0]=maxNegative;

        }
        System.out.println(maxProduct);
        System.out.println(Arrays.toString(finalarr));
    }
}
