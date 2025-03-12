/*
Input: {10, 15, 15, 20, 10, 30}
Ouput: 75

Sum of distinct elements (10+15+20+30=75)
 */

import java.util.*;

import static java.lang.reflect.Array.set;

public class Tcs6SumOfDistinctElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Set doesn't accept duplicates.

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }

        int sum = 0;
        for(int value : set){
            sum += value;
        }
        System.out.println(sum);

        //method2
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int sum1=0;
        for(int key : map.keySet()){
            sum1+=key;
        }
        System.out.println(sum1);
    }
}
