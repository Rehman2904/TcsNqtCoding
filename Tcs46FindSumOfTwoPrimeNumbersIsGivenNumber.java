import java.util.Scanner;

public class Tcs46FindSumOfTwoPrimeNumbersIsGivenNumber {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Function to check if a number can be expressed as the sum of two primes
    public static void checkSumOfTwoPrimes(int n) {
        boolean found = false;

        for (int i = 2; i <= n / 2; i++) {
            int complement = n - i;
            if (isPrime(i) && isPrime(complement)) {
                System.out.println(n + " = " + i + " + " + complement);
                found = true;
            }
        }

        if (!found) {
            System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check for sum of two primes
        checkSumOfTwoPrimes(n);

        sc.close();
    }
}

