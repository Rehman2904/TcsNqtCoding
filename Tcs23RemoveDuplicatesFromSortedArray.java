import java.util.*;

public class Tcs23RemoveDuplicatesFromSortedArray {
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

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int j=0;
        int[] uniquearray = new int[map.size()];
        for(int i : map.keySet()){
            uniquearray[j++]=i;
        }
        System.out.println(Arrays.toString(uniquearray));
    }
}
