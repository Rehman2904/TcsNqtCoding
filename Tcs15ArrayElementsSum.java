import java.util.Scanner;

public class Tcs15ArrayElementsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int c : arr){
            sum += c;
        }
        System.out.println(sum);
    }
}
