import java.util.*;

public class Tcs24RemoveDuplicatesFromUnSortedArray {
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
        Set<Integer> set = new LinkedHashSet<>(); //Only linked hashset should be used for unsorted as hashset sorts the set values.
        for(int i : arr){
            set.add(i);
        }
        int j=0;
        int[] uniquearray = new int[set.size()];
        for(int i : set){
            uniquearray[j++]=i;
        }
        System.out.println(Arrays.toString(uniquearray));
    }
}
