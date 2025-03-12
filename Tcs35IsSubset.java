import java.util.*;
public class Tcs35IsSubset {
    public static boolean isSubset(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,3,5};
        if(isSubset(arr1,arr2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
