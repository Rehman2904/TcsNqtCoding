import java.util.*;
import java.util.stream.Collectors;

public class Tcs18ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,6,8,5,0,9,7};

        int n=arr.length;

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); //Coversion of array to list

        Collections.reverse(list);

        System.out.print(list);

        Integer[] revarr = list.toArray(new Integer[0]); //Conversion of list to array

        System.out.println();

        for(int i=0; i<n; i++){
            System.out.print(revarr[i]+" ");
        }

    }
}
