import java.util.*;
public class Tcs34
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] comparearr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] sortarray1 = Arrays.copyOf(arr, n);
        Arrays.sort(sortarray1);
        System.out.println("Enter compare array elements: ");
        for(int i=0; i<n; i++){
            comparearr[i]=sc.nextInt();
        }
        int[] sortarray2 = Arrays.copyOf(comparearr, n);
        Arrays.sort(sortarray2);
        int rank = 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : sortarray2){
            map.put(i, rank++);
        }
        int[] rankarray = new int[n];
        for(int i=0; i<n; i++){
            rankarray[i] = map.get(comparearr[i]);
        }
        int m=0;
        int[] finalArray = new int[n];
        for(int i : rankarray){
            finalArray[m++] = sortarray1[i-1];
        }
        System.out.println(Arrays.toString(finalArray));
    }
}