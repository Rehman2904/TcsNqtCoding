import java.util.*;

public class Tcs19FrequencyCounterOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //count frequency of elements in array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j : arr){
            if(map.containsKey(j)){
                map.put(j,map.get(j)+1);
            }else{
                map.put(j,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +"->"+entry.getValue());
        }
    }
}
