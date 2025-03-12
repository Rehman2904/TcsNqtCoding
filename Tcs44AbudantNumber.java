public class Tcs44AbudantNumber {
    public static void main(String[] args) {
        int n=21;
        int sum =0;
        for(int i=1; i<n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        if(sum>n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
