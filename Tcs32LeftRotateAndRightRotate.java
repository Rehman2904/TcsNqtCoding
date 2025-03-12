import java.util.*;

public class Tcs32LeftRotateAndRightRotate {
    public static int[] leftRotation(int[] arr, int rotation, String fromRotation){

        int[] temp1 = new int[rotation];
        for(int i=0; i<rotation; i++){
            temp1[i] = arr[i];
        }
        int[] leftArray = new int[arr.length];
        int index = 0;
        for(int i=rotation;i<arr.length; i++){
            leftArray[index++]=arr[i];
        }
        for(int i=0;i<rotation;i++){
            leftArray[index++] = temp1[i];
        }
        return leftArray;
    }
    public static int[] rightRotation(int[] arr, int rotation, String fromRotation){
        int[] rightarray = new int[arr.length];
        int index1 = 0;
        for(int i=arr.length-rotation; i<arr.length; i++){
            rightarray[index1++] = arr[i];
        }

        for(int i=0;i<arr.length-rotation; i++){
            rightarray[index1++]=arr[i];
        }

        return rightarray;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};
        Scanner sc = new Scanner(System.in);
        int rotation = sc.nextInt();
        String fromRotation = sc.next();

        if(fromRotation.equals("left") && rotation<=arr.length){
            System.out.println(Arrays.toString(leftRotation(arr, rotation, fromRotation)));
        }else if(fromRotation.equals("right") && rotation<=arr.length){
            System.out.println(Arrays.toString(rightRotation(arr, rotation, fromRotation)));
        }else{
            System.out.println("Invalid rotation");
        }
    }
}