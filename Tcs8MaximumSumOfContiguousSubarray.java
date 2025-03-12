/*
Find the Maximum Sum of a Contiguous Subarray Given an array of integers,
find the contiguous subarray (containing at least one number) which has the
largest sum and return its sum.

Example 1:
Input: array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6

Example 2:
Input: array = [1, 2, 3, 4, 5]
Output: 15
        */

import java.util.Scanner;

public class Tcs8MaximumSumOfContiguousSubarray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i =1; i<n; i++){
            currentSum = Math.max(arr[i], (arr[i]+currentSum));
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }
}
