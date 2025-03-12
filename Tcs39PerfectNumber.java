import java.util.*;
public class Tcs39PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPerfectNumber(num)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}