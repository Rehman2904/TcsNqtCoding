import java.util.*;

public class Tcs36IsContagiousSubset {
    public static boolean isContagiousSubset(int[] arr1, int[] arr2){
        String str1 = Arrays.toString(arr1).replaceAll("[,\\[\\] ]","");
        String str2 = Arrays.toString(arr2).replaceAll("[,\\[\\] ]","");

        if(str1.contains(str2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4};

        if(isContagiousSubset(arr1,arr2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
