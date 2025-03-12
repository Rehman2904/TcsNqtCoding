import java.util.*;
public class Tcs30ReplaceArrayWithRank
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedarray = Arrays.copyOf(arr, n);
        Arrays.sort(sortedarray);

        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : sortedarray){
            if(!map.containsKey(i)){
                map.put(i, rank++);
            }
        }
        int[] rankedArray = new int[n];
        for(int i=0; i<n; i++){
            rankedArray[i] = map.get(arr[i]);
        }
        System.out.print(Arrays.toString(rankedArray));
    }
}
