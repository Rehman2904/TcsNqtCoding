public class Tcs40FindMaxAndMinDigit {
    public static void FindMaxandMin(int num){
        int maxDigit=0;
        int minDigit=9;
        while(num>0){
            int digit = num%10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            num /= 10;
        }
        System.out.println("Min Digit: "+minDigit);
        System.out.println("Max Digit: "+maxDigit);
    }
    public static void main(String[] args) {
        int num = 756461;
        FindMaxandMin(num);
    }
}
