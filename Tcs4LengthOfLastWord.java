import java.util.Scanner;

/*
String s = Hi this is Rehman  ;
Output = 6; (With out calculating end spaces.
 */
public class Tcs4LengthOfLastWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //method 1
        int count=0;
        for(int i =s.length()-1; i>0; i--){
            if(s.charAt(i) != ' '){
                count++;
            } else if (count!=0){
                break;
            }
        }
        System.out.println(count);

        //method 2
        String[] arr = s.split(" ");
        System.out.println((arr[arr.length-1]).length());

    }
}
