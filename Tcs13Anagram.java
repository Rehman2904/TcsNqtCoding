import java.util.*;
public class Tcs13Anagram {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }else{
            char[] chararray1 = str1.toCharArray();
            char[] chararray2 = str2.toCharArray();

            Arrays.sort(chararray1);
            Arrays.sort(chararray2);

            String s1 = new String(chararray1);
            String s2 = new String(chararray2);

            if(s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(isAnagram(str1,str2)) {
            System.out.println("str1" + " str2" + " are anagrams.");
        }else{
            System.out.println("str1" + " str2" + " are not anagrams.");
        }
    }
}
