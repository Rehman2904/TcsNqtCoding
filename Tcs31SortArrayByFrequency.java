/*
input: int[] arr = {4, 5, 6, 5, 4, 3};

Explanation: {3=1, 4=2, 5=2, 6=1}

output: [ 3, 6, 4, 4, 5, 5]
 */

import java.util.*;

public class Tcs31SortArrayByFrequency {
    public static int[] sortByFrequency(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }

        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int freqCompare = map.get(a).compareTo(map.get(b));
                if(freqCompare==0){
                    return a.compareTo(b);
                }else{
                    return freqCompare;
                }
            }
        });

        int[] sortedArray = new int[arr.length];
        int m=0;
        for(int i : list){
            sortedArray[m++]=i;
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = sortByFrequency(arr);
        System.out.print(Arrays.toString(result));
    }
}
