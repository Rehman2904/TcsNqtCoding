import java.util.Scanner;

//Permutations in which N people can occupy R seats in a classroom
//P(N,R)=(N!)/(N-R)!
public class Tcs46Permutations {
    public static int factorial(int a){
        int k = 1;
        for(int i=a; i>1; i--){
            k *= i;
        }
        return k;
    }
    public static int permutations(int N, int R){
        int Permutations = factorial(N)/factorial(N-R);
        return Permutations;
    }

    public static void main(String[] args) {
        int N = 6;
        int R = 4;
        System.out.println(permutations(N,R));
    }
}
