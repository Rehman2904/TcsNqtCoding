import java.util.*;
public class Tcs29SymmetricPairs {
    public static void main(String[] args) {
        int[][] pairs = {{1,2},{3,4},{5,6},{9,12},{8,1},{2,1},{6,8},{4,3},{1,8},{12,9}};

        Set<String> nonsymmetricPairs = new HashSet<>();

        List<String> symmetricPairs = new ArrayList<>();

        for(int[] pair : pairs){
            int a = pair[0];
            int b = pair[1];

            String nonsymmetric = a+","+b;
            String symmetric = b+","+a;

            if(nonsymmetricPairs.contains(symmetric)){
                symmetricPairs.add("("+a+","+b+") and ("+b+","+a+")");
            }else{
                nonsymmetricPairs.add(nonsymmetric);
            }
        }

        if(symmetricPairs.isEmpty()){
            System.out.println("No Symmetric pairs present.");
        }else {
            for (String pair : symmetricPairs) {
                System.out.println(pair);
            }
        }
    }
}
