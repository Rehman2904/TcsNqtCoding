import java.util.*;

public class Tcs27FindNonRepeatingElementsInArray {
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
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println();
        System.out.print(list);
    }
}
