import java.util.ArrayList;

public class ActivitySelection{
    public static void main(String[] args) {
        int st [] = {1,3,0,5};
        int end [] = {2,4,6,7,9,9 };

        // End time basis Sorted

        int mxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        mxact = 1;
        ans.add(0);

        int lastend = end[0];
        for(int i = 1; i< end.length ;i++){
            if (st [i] >= lastend) {
                mxact++;
                ans.add(i);
                lastend =end[i];
            }
        }
        System.out.println("Max Activity =" +mxact);
        for(int i = 0 ; i<ans.size(); i++){
            System.out.println("A"+ans.get(i) +" ");
        }
        System.out.println();
    }
}