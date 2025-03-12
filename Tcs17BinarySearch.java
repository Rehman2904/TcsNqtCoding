import java.util.Arrays;
import java.util.Scanner;

public class Tcs17BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter which element to be found: ");
        int element = sc.nextInt();

        Arrays.sort(arr);

        int first = 0;
        int last = arr.length-1;
        int middle = (first+last)/2;

        while(first<=last){
            if(arr[middle]<element){
                first = middle+1;
            }else if(arr[middle]==element){
                System.out.println(element+" is found at location "+(middle+1));
                break;
            }else{
                last=middle-1;
            }//25689
            middle=(first+last)/2;
        }
        if(first>last){
            System.out.println(element+" is not found in the array.");
        }
    }
}
