import java.util.Arrays;

public class Tcs37IsPalindrome {

    public static boolean isPalindrome(String str1){
        StringBuilder sb = new StringBuilder(str1);
        String str2 = sb.reverse().toString();
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean isPalindrome(Long num){
        String s = Long.toString(num);
        StringBuilder sb1 = new StringBuilder(s);
        String s1 = sb1.reverse().toString();
        return s.equalsIgnoreCase(s1);
    }

    public static boolean isPalindrome(int[] arr){
        String x = Arrays.toString(arr).replaceAll("[,\\[\\]]","");
        StringBuilder z = new StringBuilder(x);
        String y = z.reverse().toString();
        return x.equalsIgnoreCase(y);
    }

    public static void main(String[] args) {

        String str1 = "racecar";
        if(isPalindrome(str1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        long num = 56765;
        if(isPalindrome(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        int[] arr = {1,2,3,2,1};
        if(isPalindrome(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
