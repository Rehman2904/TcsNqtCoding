public class Tcs43HarshadNumber {
    public static void main(String[] args) {
        int num = 24;
        int sum = 0;
        int temp = num;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println(sum);
        if(num%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
