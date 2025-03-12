import java.util.Scanner;

public class Tcs16LettersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.toLowerCase();

        int count = 0;

        for(char ch='a'; ch<='z'; ch++){
            for(int i=0; i<s.length(); i++){
                if(ch==s.charAt(i)){
                    System.out.print(ch+" ");
                    count++;
                    break;
                }
            }
        }
        System.out.print("\n"+"Total number of words: "+count);
    }
}
