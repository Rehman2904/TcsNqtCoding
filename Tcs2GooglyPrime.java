/*23 is a prime and 2+3 = 5 is also prime. So 23 is a googly prime number.*/

import java.util.Scanner;

public class Tcs2GooglyPrime {
    public static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp=n, sum=0;

        while(temp>0){
            sum += temp%10;
            temp /= 10;
        }

        if(isPrime(n)&isPrime(sum)){
            System.out.println(n+" is a googly prime number");
        }else{
            System.out.println(n+" is not a googly prime number");
        }
    }
}
