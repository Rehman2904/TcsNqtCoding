/*
Problem Statement: You are given an array of integers arr and an integer k.
Your task is to find and print the maximum number in each contiguous window of size k.

Input: arr = [1, 3, -1, -3, 5, 3, 6, 7]
k = 3
Output: [3, 3, 5, 5, 6, 7]
 */


import java.util.*;
import java.util.stream.Collectors;

public class Tcs9MaxSlidingWindow {
    public static int[] maximumSlidingWindow(int[] arr, int n, int k){

        int[] result = new int[n-k+1];
        for(int i=0; i<=n-k; i++){
            int max = arr[i];
            for(int j=1; j<k; j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
                result[i] = max;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] result = maximumSlidingWindow(arr,n,k);

        List<Integer> output = Arrays.stream(result).boxed().collect(Collectors.toList());

        System.out.println(output);
    }
}