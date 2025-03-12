public class Tcs42Automorphic {
    public static void main(String[] args) {
        int n = 124;
        int m = n%10;
        if(m==0 || m==1|| m==5|| m==6){
            System.out.println("Automorphic number");
        }else{
            System.out.println("No");
        }
    }
}