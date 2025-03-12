/*
Input: {10, 15, 15, 20, 10, 30}
Ouput: 50

Sum of non repeated elements (20+30=50)
 */

import java.util.*;

public class Tcs5SumOfNonRepeatedElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int sum=0;
        for(int key : map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
        System.out.println(sum);
    }
}


/*
i=0;
---------
|10 | 1 |
---------

i=1;
---------
|10 | 1 |
---------
|15 | 1 |
---------

i=2;
---------
|10 | 1 |
---------
|15 | 2 |
---------

i=3;
---------
|10 | 1 |
---------
|15 | 2 |
---------
|20 | 1 |
---------

i=4;
---------
|10 | 2 |
---------
|15 | 2 |
---------
|20 | 1 |
---------

i=5;
---------
|10 | 2 |
---------
|15 | 2 |
---------
|20 | 1 |
---------
|30 | 1 |
---------

map.get(key) == 1
0+20=20
20+30=50
*/