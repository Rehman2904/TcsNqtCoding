/*Write a java program to enter a letter and display next five letter

Input - capital (W)
Output - XYZab

Input - small (x)
Output - yzABC
*/

import java.util.Scanner;

public class Tcs12NextFiveLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);

        for(int i=0; i<5; i++){
            s++;
            if(s>'z'){
                s='A';
            }else if(s>'Z' && s<'a'){
                s='a';
            }
            System.out.print(s);
        }
    }
}
