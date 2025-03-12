public class Tcs45FindGcdAndLcm {
    public static int Gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int Lcm(int a, int b){
        int lcm = (a*b)/(Gcd(a,b));
        return lcm;
    }

    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        System.out.println(Gcd(a,b));
        System.out.println(Lcm(a,b));
    }
}
