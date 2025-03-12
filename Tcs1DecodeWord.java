/*
Input: 1110101111
Output: CAD
 */


import java.util.*;
public class Tcs1DecodeWord
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        StringBuilder decodedword = new StringBuilder();

        String[] sequence = binary.split("0");

        char c = 0;

        for(String seq : sequence){
            if(!seq.isEmpty()){
                int length = seq.length();
                c = (char) ('A'+(length-1));
            }
            decodedword.append(c);
        }
        System.out.println(decodedword);
    }
}
