import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainImpair {
    public static void main(String[] args) {
       int[][] Pairs = {{5,24} ,{39,60} ,{5,28} , {27,40} , {50,90}};

       Arrays.sort(Pairs , Comparator.comparingDouble(o -> o[1]));

       int chainLength = 1;
       int chainEnd = Pairs[0][1];

       for (int i = 1; i < Pairs.length ; i++) {
           if (Pairs[i][0] > chainEnd) {
               chainLength++;
               chainEnd = Pairs[i][1];
           }
       }
        System.out.println("Mx Chain length is " + chainLength);
    }
}
