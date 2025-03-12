/*
Statement: Find All Subarrays with a Target Sum Description:
Given an array of integers and a target sum, find all the
subarrays within the array that sum to the target value.
A subarray is defined as a contiguous sequence of elements within the array.

Example:
Input:
array = [3, 4,-7, 1,3, 3, 1, -4]
targetSum= 7

Output:
[3, 4]
[3, 4, -7, 1, 3, 3]
[1, 3,3]
[3, 3, 1]
 */
import java.util.*;
import java.util.stream.Collectors;

public class Tcs10TargetSumSubArrays {

    public static List<int []> findSubarraysWithTargetSum(int[] array, int targetsum) {
        List<int[]> result = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            int cumulativesum = 0;
            for(int j=i; j<array.length; j++){
                cumulativesum += array[j];

                if(cumulativesum == targetsum){
                    int[] subarray = new int[j-i+1];

                    for(int k=i; k<=j; k++){
                        subarray[k-i] = array[k];
                    }
                    result.add(subarray);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        int targetSum = sc.nextInt();

        // Find all subarrays with the target sum
        List<int[]> result = findSubarraysWithTargetSum(array, targetSum);

        // Print the result
        for (int[] subarray : result) {
            List<Integer> subarrayList = Arrays.stream(subarray).boxed().collect(Collectors.toList());
            System.out.println(subarrayList);
        }
    }
}