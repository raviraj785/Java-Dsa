import java.util.Arrays;
import java.util.Scanner;

public class smallestlarge {
    public static int[] smallestandlargestelement(int[] arr) {
        Arrays.sort(arr);
        int ans[] = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size OF AN ARRAY");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter " + size + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
        }
        int ans[] = smallestandlargestelement(arr);

        System.out.println("Smallest Element: " + ans[0]);
        System.out.println("Largest Element: " + ans[1]);
    }
}
