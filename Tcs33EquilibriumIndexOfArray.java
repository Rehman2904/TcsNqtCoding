public class Tcs33EquilibriumIndexOfArray {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum =0;
        int equilibriumIndex=Integer.MIN_VALUE;

        for(int i : arr){
            totalSum += i;
        }

        for(int i=0; i<arr.length; i++){
            totalSum -= arr[i];
            if(totalSum == leftSum){
                equilibriumIndex = i;
                break;
            }else{
                equilibriumIndex = -1;
            }
            leftSum += arr[i];
        }
        return equilibriumIndex;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 2, 0};
        int equilibriumIndex = findEquilibriumIndex(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}