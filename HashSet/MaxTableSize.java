import java.util.HashSet;
  /* Question:

We are given n distinct pairs of numbers. Each pair contains the same number twice: (1,1), (2,2), ..., (n,n).

All numbers are initially placed in a bag. We take the numbers out one by one.

If a number is taken out for the first time, we put it on the table.

If the same number is taken out for the second time, we remove its first copy from the table and put both numbers aside.

We have to find the maximum number of numbers that were present on the table at the same time. */
public class MaxTableSize {

    static int maxNumbersOnTable(int[] bag) {

        HashSet<Integer> table = new HashSet<>();

        int max = 0;

        for (int i = 0; i < bag.length; i++) {

            int num = bag[i];

            if (table.contains(num)) {
                table.remove(num);
            } 
            else {
                table.add(num);

                max = Math.max(max, table.size());
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1};

        System.out.println(maxNumbersOnTable(nums));
    }
}