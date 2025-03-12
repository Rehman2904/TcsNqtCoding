import java.util.Scanner;

public class Tcs14Armstrong {

    public static boolean isArmstrong(int n){

        int sum = 0;
        int temp = n;
        while(temp>0){
            sum += Math.pow(temp%10,3);
            temp /= 10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isArmstrong(n)){
            System.out.println(n+" is an Armstrong number.");
        }else{
            System.out.println(n+" is not an Armstrong number.");
        }
    }
}
