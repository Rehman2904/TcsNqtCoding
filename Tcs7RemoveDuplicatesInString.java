/*
Remove Duplicate alphabets in the String (all in small case)

Input: hello
Output: helo

 */

import java.util.HashMap;
import java.util.Scanner;

public class Tcs7RemoveDuplicatesInString {

    public static void main(String[] args){
        int [] arr = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<s.length();i++){
            int index = s.charAt(i)-'a';
            arr[index] += 1;
            if(arr[index] == 1){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);

        /*for print alphabets in ascending order
        input = hello;
        output = ehlo;
         */
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for(char i : chars){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

        StringBuilder output = new StringBuilder();
        for(char key : map.keySet()){
            output.append(key);
        }
        System.out.println(output);
    }
}

/*
arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} By default it will create 26 0's.

i=0;
index = h - a = 104 - 97 = 7
arr[7] + 1 = 1  = arr[7]
arr = {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
arr[7]=1
Answer = h

i=1;
index = e - a = 101 - 97 = 4
arr[4] + 1 = 1  = arr[4]
arr = {0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
arr[4]=1
Answer = he

i=2;
index = l - a = 108 - 97 = 11
arr[11] + 1 = 1  = arr[11]
arr = {0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
arr[11]=1
Answer = hel

i=3;
index = l - a = 108 - 97 = 11
arr[11] + 1 = 2  = arr[11]
arr = {0,0,0,0,1,0,0,1,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
arr[4]!=1
Answer = hel

i=4;
index = o - a = 111 - 97 = 14
arr[14] + 1 = 1  = arr[14]
arr = {0,0,0,0,1,0,0,1,0,0,0,2,0,0,1,0,0,0,0,0,0,0,0,0,0,0}
arr[14]=1
Answer = helo
 */