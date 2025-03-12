import java.util.*;

public class Tcs38PalindromesInRange {

    public static boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;
        while(temp>0){
            rev = (rev*10)+temp%10;
            temp /= 10;
        }
        if(rev==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startRange = sc.nextInt();
        int endRange = sc.nextInt();

        for(int i=startRange; i<=endRange; i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
}
